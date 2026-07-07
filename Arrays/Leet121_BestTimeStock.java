class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int minVal = prices[0];

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minVal) minVal = prices[i];

            maxProfit = Math.max((maxProfit), (prices[i] - minVal));
        }

        return maxProfit;
    }
}
