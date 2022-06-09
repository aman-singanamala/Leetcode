class Solution {
    public int maxProfit(int[] prices) {
       int min_prize=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            min_prize=Math.min(prices[i],min_prize);
            profit=Math.max(profit,prices[i]-min_prize);
        }
            return profit;
    }
}