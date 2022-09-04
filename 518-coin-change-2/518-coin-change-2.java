class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        
            for(int j = 0; j < coins.length;j++){
                
                 for(int currtar = 1; currtar <= amount;currtar++){
                int remval = currtar - coins[j];
                if(remval >= 0)
                dp[currtar] += dp[remval];
            }
            }
        return dp[amount];
    }
}
