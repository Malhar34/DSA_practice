class Solution {
    public int maxProfit(int[] prices) {
        int maxProf = 0;
        for (int i = 0; i < prices.length; i++) {
            int buy = i;
            int sold = i + 1;
            while (sold < prices.length) {
                int profit = prices[sold] - prices[buy];
                sold++;
                maxProf = Math.max(maxProf, profit);
            }
        }
        return maxProf;
    }
}
