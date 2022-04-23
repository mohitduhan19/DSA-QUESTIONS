class Solution {
    //---------Recursive---------
  //   public int climb(int n){
  // if(n <= 1)return 1;
  //   int x = climb(n - 1);
  //       int y = climb(n - 2);
  //       int ans = x + y;
  //       return ans;
  //  }
    public int climbStairs(int n) {
         if(n == 0)return 0;
   
//         return climb(n);
        //----------Memoization---------
        int[] dp = new int[n + 1];
        Arrays.fill(dp , -1);
        dp[0] = 1;dp[1] = 1;
        for(int i = 2; i<=n;i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
     }
}