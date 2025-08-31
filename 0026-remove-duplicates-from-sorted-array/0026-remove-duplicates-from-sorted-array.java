class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int u = 0;
        for(int i = 1; i <n ; i++){
            if(nums[i] != nums[u]){
                u++;
                nums[u] = nums[i];
            }
        }
        return u+1;
    }
}