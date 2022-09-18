class Solution {
    public int countSubstrings(String s) {
       boolean[][] dp = new boolean[s.length()][s.length()];
        int count = 0;
        for(int gp = 0; gp < s.length();gp++){
            for(int i = 0 , j = gp; j < dp.length;i++,j++){
                if(gp == 0){
                    dp[i][j] = true;
                }else if(gp == 1){
                    dp[i][j] = s.charAt(i) == s.charAt(j)?true:false;
                }else{
                    if(s.charAt(i) == s.charAt(j) && dp[i + 1][ j - 1] == true){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = false;
                    }
                }
                if(dp[i][j] == true)count++;
            }
        }
        return count;
    }
}