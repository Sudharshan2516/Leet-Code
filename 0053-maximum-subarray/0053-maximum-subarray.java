class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        long max = Long.MIN_VALUE;
        long Sum = 0;
        for(int i = 0; i < n; i++){
            Sum += nums[i];
            if(Sum > max){
                max = Sum;
            }

            if(Sum < 0){
                Sum =0;
            }
        }
        return (int)max;
    }
}