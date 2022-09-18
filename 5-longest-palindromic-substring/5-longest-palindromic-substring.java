class Solution {
    public String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int len = 0;
        int x = -1 , y = -1;
        for(int gp = 0;gp < s.length();gp++){
            for(int i = 0 , j = gp;j < s.length();i++,j++){
                if(gp == 0){
                    dp[i][j] = true;
                }else if(gp == 1){
                    if(s.charAt(i) == s.charAt(j)) dp[i][j] = true;
                    else  dp[i][j] = false;
                }else{
                     if(s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == true){
                         dp[i][j] = true;
                     }else{
                          dp[i][j] = false;
                     }
                }
                if(dp[i][j]){
                   x = i;
                    y = j;
                }
            }
        }
      return s.substring(x ,  y + 1);
    }
}
