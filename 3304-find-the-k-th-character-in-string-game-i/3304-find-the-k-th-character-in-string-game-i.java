class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        
        while (sb.length() < k) {
            StringBuilder next = new StringBuilder();
            for (int i = 0; i < sb.length(); i++) {
                char ch = sb.charAt(i);
                char nextChar = (char) ((ch - 'a' + 1) % 26 + 'a'); // wrap around after 'z'
                next.append(nextChar);
            }
            sb.append(next);
        }
        
        return sb.charAt(k - 1); // 1-based index
    }
}