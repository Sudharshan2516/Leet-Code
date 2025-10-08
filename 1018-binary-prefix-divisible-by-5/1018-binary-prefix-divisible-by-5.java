class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int n = nums.length;
        int ne =0;
        for(int i =0;i<n;i++){
            ne = ((ne<<1)+nums[i])%5;
             result.add(ne == 0);
        }
        return result;
    }
}