class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashSet<Integer> Se = new HashSet<>();
        int xor = 0;
        for(int num : nums){
            if(!Se.add(num)){
                xor ^= num;
            }
        }
        return xor;
    }
}