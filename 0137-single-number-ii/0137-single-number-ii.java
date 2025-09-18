class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> Mp = new HashMap<>();
        for (int num : nums) {
            Mp.put(num, Mp.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> Mh : Mp.entrySet()) {
            if (Mh.getValue() == 1) {
                return Mh.getKey();
            }
        }
        return -1;
    }
}