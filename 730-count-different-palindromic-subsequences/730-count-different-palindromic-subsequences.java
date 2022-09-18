class Solution {
    public int countPalindromicSubsequences(String s) {
        int[] prev = new int[s.length()];
        HashMap<Character , Integer> map = new HashMap<>();;
        
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch))prev[i] = -1;
            else prev[i] = map.get(ch);
            
            map.put(ch , i);
        }
        int[] next = new int[s.length()];
        map.clear();
        
         for(int i = s.length() - 1; i >= 0;i--){
            char ch = s.charAt(i);
            if(!map.containsKey(ch))next[i] = -1;
            else next[i] = map.get(ch);
            
            map.put(ch , i);
        }
        int mod = 1000000007;
        
         int[][] dp = new int[s.length()][s.length()];
        
        for(int gp = 0; gp < s.length();gp++){
            for(int i = 0 , j = gp; j < dp.length;i++,j++){
                if(gp == 0){
                    dp[i][j] = 1;
                }else if(gp == 1){
                    dp[i][j] = 2;
                }else{
                    char c1 = s.charAt(i);
                    char c2 = s.charAt(j);
                    if(c1 != c2){
                        dp[i][j] = (dp[i + 1][j] + dp[i][j - 1] - dp[i + 1][j - 1])%mod;
                    }else{
                        int n = next[i];
                        int p = prev[j];
                        
                        if(n > p){
                            dp[i][j] = ((2 * dp[i + 1][j - 1]) + 2)%mod;
                        }else if(n == p){
                             dp[i][j] = ((2 * dp[i + 1][j - 1]) + 1)%mod;
                        }else{
                             dp[i][j] = ((2 * dp[i + 1][j - 1]) - dp[n + 1][p - 1])%mod;
                        }
                    }
                    
                        if(dp[i][j] < 0)
                    dp[i][j] += mod;
                }
            }
        }
        return dp[0][dp[0].length- 1] % mod;
    }
}