class Solution {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int maxP = 0;
        for(int i = 1; i< prices.length; i++){
            int currentProfit = prices[i] - mini;
            maxP = Math.max(maxP, currentProfit);
            mini = Math.min(mini, prices[i]);
        }
        return maxP;
    }
}