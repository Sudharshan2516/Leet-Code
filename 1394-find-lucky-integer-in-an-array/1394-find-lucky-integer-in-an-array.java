class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
      int res = new int[502];
      for(nums:arr){
        res[nums]++;
      }
      for(int i = 501; i >=1; i--){
        if(res[i] = i){
            return i;
        }
      }
      return -1;
    }
}