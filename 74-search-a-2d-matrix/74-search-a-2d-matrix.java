class Solution {
    public boolean searchmatrix1(int[][] matrix ,int target){
        int n = matrix.length , m = matrix[0].length;
        int left = 0, right = n*m - 1;
        while(left <= right){
            int midcell = left + (right - left)/2;
            int row = midcell/m;
            int col = midcell%m;
            if(matrix[row][col] == target) return true;
            
            if(matrix[row][col] < target)left = midcell + 1;
            else right = midcell  - 1;
            
            
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        return searchmatrix1(matrix , target);
        
    }
}