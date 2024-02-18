class Solution {
    int stock = -1;
    int index = 0;
    int sum = 0;
    public int maxProfit(int[] prices) {
        if(prices.length==1) return 0;
        // F(n) = 만약 지금 들고있는 주식이 현재 주식보다 비싸다면 판다. 만약 지금 들고있는 주식이 다음 주식보다 싸다면 산다.
        while(index < prices.length) {
            if(stock == -1) { // 현재 주식이 없다면, 다음 주식과 현재 주식을 비교하고 구매한다.
                checkNext(prices);
            } else { // 현재 주식이 있다면, 현재 주식과 내 주식의 가격을 비교하고 판매한다.
                checkNow(prices);
                checkNext(prices);
            }
            
            index++;
        }
        
        if(stock != -1) {
            sum += stock;
        }
        return sum;
    }
    
    public void checkNow(int[] prices) {
        // 주식을 들고있을 경우, 지금 주식이 현재 주식보다 비싸다면 판다.
        if(prices[index] > stock && stock != -1) {
            sum += prices[index];
            stock = -1;
        }
    }
    
    public void checkNext(int[] prices) {
        // 주식을 들고있지 않을 경우, 주식이 다음 주식보다 싸다면 산다.
        if(prices.length - index == 1) {
            return;
        }
        if(prices[index] < prices[index+1] && stock == -1) {
            stock = prices[index];
            sum -= stock;
        }
    }
}