class Solution {
    public boolean search(int[] nums, int target) {
        Set<Integer> mp = new HashSet<>();
        for(int n : nums){
            mp.add(n);
        }
        if(mp.contains(target)){
                return true;
        } 
        return false;
    }

}