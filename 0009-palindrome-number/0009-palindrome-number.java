class Solution {
    public int reverse(int x){
        int r = 0;
        while(x >0){
            int d = x%10;
            r = r*10+d;
            x = x/10;
        }
        return r;
    }
    public boolean isPalindrome(int x) {
        int reversen = reverse(x);
        return reverse == x;
    }
}