class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int xor = 0;
        int re = -1;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int num : nums){
            mp.put(num, mp.getOrDefault(num,0)+1);
            if(mp.get(num)>1){
                re = num;
                break;
            }
        }
        for(int i =1; i<=n;i++){
            xor = xor^i;
        }
        for(int num : nums){
            xor ^= num;
        }
        int miss = xor ^ re;
        return new int[]{re, miss};

    }
}