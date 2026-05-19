class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
       // int Cmn = -1;
       int ft =0; 
       int Sd = 0;
       while(ft < n1 && Sd < n2){
        if(nums1[ft] == nums2[Sd]){
        return nums1[ft];
        // ft++;
        // Sd++;
        }
       else if (nums1[ft]< nums2[Sd]){
        ft++;
       }
       else {
        Sd++;
       }
       }

       return -1;
    }
}