class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        Map<Integer, Integer> freq = new HashMap<>();
        int n = basket1.length;
        int minVal = Integer.MAX_VALUE;

       
        for (int i = 0; i < n; i++) {
            freq.put(basket1[i], freq.getOrDefault(basket1[i], 0) + 1);
            freq.put(basket2[i], freq.getOrDefault(basket2[i], 0) - 1);
            minVal = Math.min(minVal, Math.min(basket1[i], basket2[i]));
        }

        List<Integer> toSwap = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int count = entry.getValue();
            int cost = entry.getKey();

           
            if (count % 2 != 0) return -1;

            for (int i = 0; i < Math.abs(count) / 2; i++) {
                toSwap.add(cost);
            }
        }

        Collections.sort(toSwap);

        long totalCost = 0;
        for (int i = 0; i < toSwap.size() / 2; i++) {
            totalCost += Math.min(toSwap.get(i), 2 * minVal);
        }

        return totalCost;
    }
}
