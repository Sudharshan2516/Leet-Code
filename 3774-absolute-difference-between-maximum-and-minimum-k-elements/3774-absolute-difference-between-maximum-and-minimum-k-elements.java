class Solution {
    public int absDifference(int[] nums, int k) {
       Arrays.sort(nums);
        int n = nums.length;
        int min =0;
        int max = 0;
        for(int i = 0; i <k; i++){
            min += nums[i];
        }
        for(int i = n-k; i < n; i++){
            max += nums[i];
        }
        int result = Math.abs(max-min);
        return result;
    }
}