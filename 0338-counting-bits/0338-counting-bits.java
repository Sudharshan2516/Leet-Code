class Solution {
    private int count (int n){
        int count =0;
        while(n!=0){
            n &= (n-1);
            count++;
        }
        return count;
    }
    public int[] countBits(int n) {
        int k = n+1;
        int[] res = new int[k];
        for(int i =0;i<=n;i++){
            res[i] = count(i);
        }
        return res;
    }
}