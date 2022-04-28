class Solution {
   public int minimumEffortPath(int[][] heights) {
        int left = 0, right = (int) 10e6;
        while (left < right) {
            int middle = (right + left) / 2;
            if (dfs(heights, new boolean[heights.length][heights[0].length], 0, 0, heights[0][0], middle))
                right = middle;
            else
                left = middle + 1;
        }
        return right;
    }


    private boolean dfs(int[][] heights, boolean[][] visited, int row, int column, int lastHeight, int threshold) {
        if (row < 0 || row >= heights.length || column < 0 || column >= heights[0].length ||
                visited[row][column] || Math.abs(heights[row][column] - lastHeight) > threshold)
            return false;

        visited[row][column] = true;

        return ((row == heights.length - 1 && column == heights[0].length - 1)
                || dfs(heights, visited, row + 1, column, heights[row][column], threshold)
                || dfs(heights, visited, row - 1, column, heights[row][column], threshold)
                || dfs(heights, visited, row, column + 1, heights[row][column], threshold)
                || dfs(heights, visited, row, column - 1, heights[row][column], threshold));
    }
}