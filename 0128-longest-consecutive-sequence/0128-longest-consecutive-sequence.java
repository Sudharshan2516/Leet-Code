class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int Longest = 1;
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int longest = 0;
        for (int num : nums) {
           
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                longest = Math.max(longest, currentLength);
            }
        }

        return longest;
        
    }
}