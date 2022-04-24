class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        
        for(int i = 0; i < coins.length;i++){
            for(int currtarget = 1; currtarget <= amount;currtarget++){
                int remval = currtarget - coins[i];
                if(remval >= 0)dp[currtarget] += dp[remval];
            }
        }
        return dp[amount];
    }
}