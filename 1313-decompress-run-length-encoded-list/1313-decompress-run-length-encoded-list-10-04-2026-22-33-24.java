class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
         for (int j = 1; j < n; j += 2){
            int fre = nums[j-1];
            int val = nums[j];
            for(int i = 0; i < fre; i++){
                ans.add(val);
            }
         }
         int[] res = new int[ans.size()];
         for(int i = 0; i < ans.size(); i++){
            res[i] = ans.get(i);
         }
         return res;
    }
}