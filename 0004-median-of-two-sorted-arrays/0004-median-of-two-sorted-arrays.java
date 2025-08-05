class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int sArray[] = new int[n+m];
        int i = 0, j =0, k = 0;
        while(i <n && j < m){
            if(nums1[i] < nums2[j]){
                sArray[k++] = nums1[i++];
            }
            else{
                sArray[k++] = nums2[j++];
            }
        }
        while(i < n){
            sArray[k++] = nums1[i++];
        }
        while(j < m){
            sArray[k++] = nums2[j++];
        }
        int me = n+m;
        if(me%2 == 0){
            return (sArray[me/2 - 1 ] + sArray[me/2])/2.0;
        }
        else{
            return sArray[me/2];
        }
            
        }
    }