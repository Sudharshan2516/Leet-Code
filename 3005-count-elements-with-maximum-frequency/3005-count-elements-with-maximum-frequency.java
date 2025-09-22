class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int n : nums){
            m.put(n, m.getOrDefault(n,0)+1);
        }
          int maxFreq = 0;
        for (int freq : m.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }
        
        int totalCount = 0;
        for (int freq : m.values()) {
            if (freq == maxFreq) {
                totalCount += freq;
            }
        }
        
        return totalCount;

    }
}