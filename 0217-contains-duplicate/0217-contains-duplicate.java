class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> Mp = new HashMap<>();
        for (int nu : nums) {
            if (Mp.containsKey(nu) && Mp.get(nu) >= 1)
                return true;
            Mp.put(nu, Mp.getOrDefault(nu, 0) + 1);
        }
        return false;
    }
}