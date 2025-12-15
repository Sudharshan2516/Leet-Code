class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<Integer> Tin = new ArrayList<>();
       for(int i =0; i< n;i++){
        if(nums[i] == target){
            Tin.add(i);
        }
       }
       return Tin;
    }
}