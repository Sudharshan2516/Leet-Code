class Solution {
    private int count (int n ){
        int cnt =0;
        while(n != 0){
            n &= (n-1);
            cnt++;
        }
        return cnt;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum =0;
        for(int i =0;i<nums.size();i++){
            if(count(i) == k){
                sum += nums.get(i);
            }
        }
        return sum;
    }
}