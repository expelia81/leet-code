class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        
        for(int i=0; i<prices.length;i++) {
            min = Math.min(prices[i],min);
            result=Math.max(prices[i]-min,result);
        }
        
        return result;
    }
}