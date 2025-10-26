class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int uni : nums){
            mp.put(uni, mp.getOrDefault(uni,0)+1);
        }
        int res = 0;
          for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
               if (entry.getValue() == 1) {
                    res += entry.getKey();
               }
          }
          return res;
    }
}