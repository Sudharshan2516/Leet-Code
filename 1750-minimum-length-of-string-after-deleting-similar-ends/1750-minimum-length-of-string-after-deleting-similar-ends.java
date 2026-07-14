class Solution {
    public int minimumLength(String s) {
        int pre = 0;
        int suf = s.length()-1;
        while(pre < suf && s.charAt(pre) == s.charAt(suf)){
            char cr = s.charAt(pre);
            while(pre <= suf && s.charAt(pre) == cr){
                pre++;
            }
            while(pre <= suf && s.charAt(suf) == cr){
                suf--;
            }

        }
        return suf-pre+1;
    }
}