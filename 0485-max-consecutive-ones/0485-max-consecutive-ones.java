class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int ccount = 0;
        int mcount = 0;
        for(int i =0;i<n;i++){
            if(nums[i] == 1){
                ccount++;
                mcount = Math.max(ccount, mcount);
            }
            else {
                ccount = 0;
            }

        }
        return mcount;
    }
}