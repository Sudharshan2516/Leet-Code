class Solution {
    private void Com(List<Integer> v, int i, int sum, List<Integer> v2, List<List<Integer>> ans){
        if(sum == 0){
            ans.add(new ArrayList<>(v2));
            return;
        }
        if(sum < 0|| i == v.size()) {
            return;
            }
            Com(v,i+1,sum, v2, ans);
        v2.add(v.get(i));
        Com(v, i, sum-v.get(i), v2, ans);
        v2.remove(v2.size()-1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> v = new ArrayList<>();
        for(int nums: candidates){
            v.add(nums);
        }
        Com(v, 0, target,new ArrayList<Integer>(), ans);
        return ans;
    }
}