class Solution {
    private final String[] map;
public Solution() {
    map= new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
}
    private void help(int in, String crr, List<String> ans, String Num){
        if(in == Num.length()){
            ans.add(crr);
            return;
        }
        String s = map[Num.charAt(in)-'0'];
        for(int i = 0;i<s.length();i++){
            help(in+1, crr+s.charAt(i), ans, Num);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String>ans = new ArrayList<>();
        help(0, "", ans, digits);
        return ans;
    }
}