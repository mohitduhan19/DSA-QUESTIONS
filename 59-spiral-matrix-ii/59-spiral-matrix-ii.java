class Solution {
    public int[][] generateMatrix(int n) {
      int [][] mat = new int[n][n];
       int frow = 0 , fcol = 0 , lrow = mat.length-1,lcol = mat[0].length - 1;
        int val = 1;
        while(frow <= lrow && fcol <= lcol){
            //left to right
            for(int i = fcol;i <= lcol;i++)  mat[frow][i] = val++;
              //right to bottom
               for(int j = frow + 1; j <= lrow;j++) mat[j][lcol] = val++;
                     
                if(frow < lrow && fcol < lcol){
                    //right to left
                    for(int k = lcol - 1; k > fcol;k--) mat[lrow][k] = val++;
                     //bottom to top
                        for(int s = lrow;s > frow;s--)mat[s][fcol] = val++;   
                    }
                    frow++;lrow--;fcol++;lcol--;
        }
        return mat;                         
    }
}