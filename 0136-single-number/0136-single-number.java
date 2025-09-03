class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int s = nums[0];
        for(int i =0; i < n;i++){
            s = s^nums[i];
        }
    return s;
    }
}