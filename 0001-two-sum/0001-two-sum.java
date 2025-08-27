class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> a = new HashMap<>();
        int n = nums.length;
        for(int i =0; i < n; i++){
            int crr = nums[i];
            int m = target - crr;
            if(a.containsKey(m)){
                return new int[]{a.get(m),i};
            }
            a.put(crr,i);
        }
        return new int[]{-1,-1};
    }
}