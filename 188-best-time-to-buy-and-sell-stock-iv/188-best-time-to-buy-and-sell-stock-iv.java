class Solution {
    public int maxProfit(int k, int[] prices) {
       //       TC -> O(n^3) 
        int n = prices.length;
        int[][] dp = new int[k + 1][n];
         if(k == 0) return 0;
        if(k < 0) return Integer.MIN_VALUE;
       if(n <= 0)return 0;
        for(int row = 1; row <= k;row++){
           for(int col = 1; col < n; col++){
               int max = dp[row][col - 1];
               
               for(int prevcol = 0; prevcol < col ;prevcol++){
                   int maxtill = dp[row - 1][prevcol];
                   int diff = prices[col] - prices[prevcol];
                   if(maxtill + diff > max){
                       max = maxtill + diff;
                   } 
               }
               
               dp[row][col] = max;
           }
        }
        return dp[k][n - 1];
        
   //--------------------TC -> O(n^2)------------------------------------------     
//         int n = prices.length;
//         int[][] dp = new int[k + 1][n];
//         if(k == 0) return 0;
//         if(k < 0) return Integer.MIN_VALUE;
//        if(n <= 0)return 0;
//         for(int row = 1; row <= k;row++){
//            for(int col = 1; col < n; col++){
//                int max = Integer.MIN_VALUE;
               
//                if(dp[row - 1][col - 1] - prices[col - 1] > max)max = dp[row - 1][col - 1] - prices[col - 1];
//                if(max + prices[col] > dp[row][col - 1])dp[row][col] = max + prices[col];
//                else{
//                    dp[row][col] = dp[row][col - 1];
//                }
              
//            }
//         }
//         return dp[k][n - 1];
        
        
    }
}