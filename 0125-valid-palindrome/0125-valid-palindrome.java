class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
       
        String clean = "";
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                clean += ch;
            }
        }
        String reverse = new StringBuilder(clean).reverse().toString();
        return clean.equals(reverse);
    }
}