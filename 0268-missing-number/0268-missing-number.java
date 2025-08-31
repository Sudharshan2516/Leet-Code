class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
       // int sum = (n*(n+1))/2;// finding sum of length of array 
        int k = 0;
        for(int i =0;i<n;i++){
            k = k^i^nums[i];
        }
        return k^n;
    }
}