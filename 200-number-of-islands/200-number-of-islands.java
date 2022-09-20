class Solution {
    public void dfs(char[][] nums , int i , int j){
        if(i < nums.length && j < nums[0].length && i >= 0 && j >= 0 && nums[i][j] == '1'){
            nums[i][j] = '0';
            dfs(nums , i + 1 , j);
            dfs(nums , i, j + 1);
            dfs(nums , i - 1 , j);
            dfs(nums , i , j - 1);
        }
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        
        for(int i = 0; i < grid.length;i++){
            for(int j = 0; j < grid[0].length;j++){
                if(grid[i][j] == '1'){
                    dfs(grid , i , j);
                    count++;
                }
            }
        }
        return count;
    }
}