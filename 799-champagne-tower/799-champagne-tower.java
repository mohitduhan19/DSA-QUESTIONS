class Solution {
    public double champagneTower(int poured, int queryrow, int queryglass) {
        double[][] res = new double[queryrow + 1][queryglass + 2];
        res[0][0] = poured;
        
        for(int i = 0; i < queryrow;i++){
            for(int j = 0; j <= queryglass;j++){
                double q = Math.max(res[i][j] - 1.0 , 0)/2.0;
                
                res[i + 1][j] += q;
                res[i + 1][j + 1] += q;
            }
        }
        return Math.min(res[queryrow][queryglass] , 1.0);
    }
}