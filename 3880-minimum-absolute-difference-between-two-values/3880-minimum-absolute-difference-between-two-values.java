class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int diff = Integer.MAX_VALUE;
        int last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (last != -1 && nums[last] != nums[i]) {
                    diff = Math.min(diff, i - last);
                }
                last = i;
            }
        }

        return diff == Integer.MAX_VALUE ? -1 : diff;
    }
}