class Solution {
    int max = 0;
    public int longestIncreasingPath(int[][] matrix) {
        
        int[][] cache = new int[matrix.length][matrix[0].length];
        int[][] visited = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                dfs(matrix, i, j, Integer.MIN_VALUE, cache, visited);
            }
        }
                
        return max;
    }
    
    public int dfs(int[][] matrix, int x, int y, int prev, int[][] cache, int[][] visited) {
        
        if (x < 0 || y < 0 || x > matrix.length - 1 || y > matrix[0].length - 1 || matrix[x][y] <= prev || visited[x][y] == 1) {
            return 0;
        }
        
        if (cache[x][y] > 0) return cache[x][y];        
        visited[x][y] = 1;
        
        // up
        int up = dfs(matrix, x - 1, y, matrix[x][y], cache, visited);
        
        // down
        int down = dfs(matrix, x + 1, y, matrix[x][y], cache, visited);
        
        // left
        int left = dfs(matrix, x, y - 1, matrix[x][y], cache, visited);
        
        // right
        int right = dfs(matrix, x, y + 1, matrix[x][y], cache, visited);
        
        int maxUpDown = Math.max(up, down);
        int maxLeftRight = Math.max(left, right);
        
        int result = 1 + Math.max(maxUpDown, maxLeftRight);
        max = Math.max(max, result);
        cache[x][y] = result;
        visited[x][y] = 0;
        return result;
    }
}