class Solution {
    public boolean isPalindrome(int x) {
 if(x<0) {return false;
    }
     int temp =x;
        int r =0;
        while(x > 0){
            int n  = x%10;
            r = (r*10)+n;
            x = x/10;
        }
     return temp == r;  
    }
}
