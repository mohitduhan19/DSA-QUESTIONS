class Solution {
    public int longestPalindromeSubseq(String s) {
         int[][] dp = new int[s.length()][s.length()];
        
        for(int gp = 0; gp < s.length();gp++){
            for(int i = 0 , j = gp; j < dp.length;i++,j++){
                if(gp == 0){
                    dp[i][j] = 1;
                }else if(gp == 1){
                    dp[i][j] = s.charAt(i) == s.charAt(j)?2:1;
                }else{
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = 2 + dp[i + 1][j - 1];
                    }else{
                        dp[i][j] = Math.max(dp[i][j - 1] , dp[i + 1][j]);
                    }
                }
            }
        }
        return dp[0][s.length() - 1];
    }
}