class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int buyingDay = prices[0];
        
        for(int i = 1 ; i < n ;i++){
            int currProfit = prices[i] - buyingDay;
            if(left[i - 1] > currProfit)currProfit = left[ i - 1];

            left[i] = currProfit;
            buyingDay = Math.min(prices[i] , buyingDay);
        }   
        int sellingDay = prices[n - 1];
        
        for(int i = n - 2; i >= 0 ;i--){
            int currProfit  = sellingDay - prices[i];
            if(right[i + 1] > currProfit)currProfit = right[i + 1];
            right[i] = currProfit;
            
            sellingDay = Math.max(prices[i] , sellingDay);
        }
       int maxProfit = 0;
        for(int i = 0; i < n;i++){
            int currProfit = left[i] + right[i];
            if(currProfit > maxProfit) maxProfit = currProfit;
        }
        return maxProfit;
    }
}