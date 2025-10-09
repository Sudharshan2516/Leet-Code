class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         Set<List<Integer>> Tri = new HashSet<>();
        int n = nums.length;
       
        // the main critical thing is (i != j != k);
        //brute force 
        for(int i = 0; i < n; i++){
            Set<Integer> hashset = new HashSet<>();
            for(int j = i + 1; j < n; j++){
                int k = - (nums[i] + nums[j]);

                    if(hashset.contains(k) ){
                            List<Integer> temp = new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(k);
                        Collections.sort(temp);
                        Tri.add(temp);
                    }
                    hashset.add(nums[j]);
                }   
            }
             List<List<Integer>> ans = new ArrayList<>(Tri);
        return ans;
    }
       
}