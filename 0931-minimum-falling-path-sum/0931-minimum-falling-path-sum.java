class Solution {
    public int minFallingPathSum(int[][] m) {
        int k=m.length;
        int n=Integer.MAX_VALUE;
        int dp[][] = new int[k][k];
        for(int a[]:dp)
        {
            Arrays.fill(a,-1);
        }
        for(int i=0;i<k;i++)
        {
            n=Math.min(n,task(k,i,k-1,m,dp));
        }
        return n;
    }
    public int task(int n, int j, int i, int m[][], int dp[][])
    {
        if(j<0||j>=n)
            return Integer.MAX_VALUE;
        if(i==0)
            return m[0][j];
        if(dp[i][j] != -1)
            return dp[i][j];
        else
            return dp[i][j] = m[i][j]+Math.min(task(n,j-1,i-1,m,dp),Math.min(task(n,j,i-1,m,dp),task(n,j+1,i-1,m,dp)));
    }
}