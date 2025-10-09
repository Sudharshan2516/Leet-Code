class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        //2 optimal approaches
// Observations 
// all elements are +ve 
// even -ve elements and rest +ve
// odd -ve elements and rest +ve
//Special Case what if it has 0's.
int ans = Integer.MIN_VALUE;
int pre = 1; int suf = 1;
for(int i = 0 ; i < n ; i++){
 if(pre == 0) pre  = 1;
 if(suf == 0) suf = 1;

 pre *= nums[i];
 suf *= nums[n-i-1];

 ans = Math.max(ans, Math.max(pre, suf));
}
return ans;

    }
}