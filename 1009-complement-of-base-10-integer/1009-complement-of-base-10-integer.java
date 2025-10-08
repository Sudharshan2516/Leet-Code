class Solution {
    public int bitwiseComplement(int n) {
        if(n == 1) return 0;
        int mask =1;
        while(mask < n){
            mask = (mask<<1)+1;
        }
        return mask ^ n;
    }
}