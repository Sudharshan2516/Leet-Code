class Solution {
    private boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }

    public List<List<String>> partition(String s) {
        List<String> path = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        solve(0, s, path, ans);
        return ans;
    }

    private void solve(int in, String s, List<String> path, List<List<String>> ans) {
        if (in == s.length()) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = in; i < s.length(); i++) {
            if (isPalindrome(s, in, i)) {
                path.add(s.substring(in, i+1));
                solve(i + 1, s, path, ans);
                path.remove(path.size()-1);
            }
        }
        
    }
}