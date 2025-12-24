class Solution {
    public int arrangeCoins(int n) {
        int fcount = 0;
        int row = 1;
        while(n>= row){
           n -= row;
            fcount++;
            row++;

        }
        return fcount;
    }
}