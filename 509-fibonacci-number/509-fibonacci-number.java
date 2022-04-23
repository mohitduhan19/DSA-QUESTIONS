class Solution {
    //Memoization
//     public int fibmem(int n ,  int[] dp){
//         if(n == 0 || n == 1)return n;
//         if(dp[n] != -1)return dp[n];
        
//         int fib1 = fibmem(n - 1 , dp);
//         int fib2 = fibmem(n - 2, dp);
//         dp[n] = fib1 + fib2;
//         return dp[n];
//     }
    
    // --------Recursive--->TC-O(2^n)-------
          // public int fibrec(int n){
//         if(n == 0 || n == 1)return n;
//         int fib1 = fib(n - 1);
//         int fib2 = fib(n - 2);
        
//         int ans = fib(n - 1) + fib(n - 2);
//         return ans;
//     }
       public int fib(int n) {
//         return fibrec(n);
        
        //--------------Tabulation -> TC-O(n)-----------
        int[] dp = new int[n + 1];
           if(n == 0)return 0;
        dp[0] = 0 ; dp[1] = 1;
        
        for(int i = 2; i <= n;i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
        
        //-----------------Memoization---------------
        
        // int[] dp = new int[n + 1];
        // Arrays.fill(dp , -1);
        // fibmem(n , dp);
        // return dp[n];
    }
    
}