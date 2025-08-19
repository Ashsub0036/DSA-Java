class Solution {
    public int maxProfit(int[] prices) {
       int maxprofit =0,currentprofit=0;
       for(int i=1;i<prices.length;i++){
        currentprofit += prices[i] - prices[i-1];
        if( currentprofit <0) currentprofit =0;
        maxprofit = Math.max(maxprofit,currentprofit);     
          }
          return maxprofit;
    }
}