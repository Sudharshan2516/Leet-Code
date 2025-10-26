class Solution {
    public int[] rearrangeArray(int[] nums) {
        int N = nums.length;
        int[] res = new int[N];
        int p =0, ne = 1;
        for(int i =0; i<N;i++){
            if(nums[i]<0){
                res[ne] = nums[i];
                ne += 2;
            }
            else{
                res[p] = nums[i];
                p += 2;
            }
        }
        return res;
    }
}