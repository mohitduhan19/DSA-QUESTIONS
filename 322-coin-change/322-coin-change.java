class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        
        dp[0] = 0;
        
        for(int amt = 1; amt <= amount; amt++) {
            for(int coin: coins) {
                if(amt - coin >= 0) {
                    dp[amt] = Math.min(dp[amt], 1 + dp[amt - coin]);                        
                }
            }
        }

        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}