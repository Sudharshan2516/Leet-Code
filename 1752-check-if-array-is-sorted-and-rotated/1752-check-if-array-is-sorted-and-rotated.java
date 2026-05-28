class Solution {
    public boolean check(int[] nums) {
        return check(0,0, nums);
    }
    private boolean check (int i ,int cnt,  int[] nums){
        int n = nums.length;
        if(i == n) return cnt <=1;
        int next = (i+1) % n;
        if(nums[i] > nums[next]) cnt++;
        if(cnt >1) return false;
        return check(i+1,cnt, nums);
    }
}