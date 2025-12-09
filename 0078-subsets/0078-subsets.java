class Solution {
    private void Sub(int i , List<Integer> re, int [] nums, List<List<Integer>> ans){
        if(i == nums.length){
            ans.add(new ArrayList<>(re));
            return ;
        }
        re.add(nums[i]);
        Sub(i+1, re, nums, ans);
        re.remove(re.size()-1);
        for(int k = i+1; k< nums.length;k++){
            if(nums[k] != nums[i]){
                Sub(k,re, nums, ans);
                return;
            }
        }
        Sub(nums.length, re, nums,ans);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> re = new ArrayList<>();
        Arrays.sort(nums);
        Sub(0,re, nums, ans);
        return ans;
    }
}