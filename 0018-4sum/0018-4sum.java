class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            for (int j = i + 1 ; j < n ; j++){
                for(int k = j + 1; k < n; k++){
                    for(int L = k + 1; L < n; L++){
                        long Sum = nums[i]+nums[j]+nums[k]+ nums[L];
                        if(Sum == target){
                            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[L]);
                            Collections.sort(temp);
                            set.add(temp);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}