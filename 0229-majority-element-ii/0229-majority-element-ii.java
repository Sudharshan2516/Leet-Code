class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int min = n / 3 +1;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int a : nums){
            mp.put(a, mp.getOrDefault(a,0)+1);
        }
        List<Integer> Rl = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
             if (entry.getValue() >= min) {
                Rl.add(entry.getKey());
            }
        }
        return Rl;
    }
}