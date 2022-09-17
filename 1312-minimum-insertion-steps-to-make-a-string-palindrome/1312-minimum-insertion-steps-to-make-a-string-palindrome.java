class Solution {
    public int minInsertions(String s) {
        int[][] dp = new int[s.length()][s.length()];
        
        for(int gap = 0;gap < s.length();gap++){
            for(int i = 0 , j = gap;j < s.length();i++,j++){
                if(gap == 0){
                    dp[i][j] = 1;
                }else if(gap == 1){
                    dp[i][j] = s.charAt(i) == s.charAt(j) ? 2 : 1;
                }else{
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = 2 + dp[i + 1][j - 1];
                    }else{
                        dp[i][j] = Math.max(dp[i + 1][j] , dp[i][j - 1]);
                    }
                }
            }
        }
        
        return s.length() - dp[0][dp[0].length - 1];
    }
}