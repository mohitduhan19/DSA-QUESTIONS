class Solution {
    public int[][]direction = new int[][]{{0 , 1} , {1 , 0} ,{- 1 , 0} , { 0 , -1} , {-1 , 1} ,{-1 , -1}
                           ,{1 , 1} ,{1 , -1}};
    
    public void update(int[][] board){
        for(int i = 0; i < board.length;i++){
            for(int j = 0; j < board[0].length;j++){
                if(board[i][j] == -2){
                    board[i][j] = 0;
                }else if(board[i][j] == 3){
                    board[i][j] = 1;
                }
            }
        }
    }
    public int getneigh(int[][] board , int row , int col){
        int active = 0;
        for(int[] directions : direction){
            int newrow = row + directions[0];
            int newcol = col + directions[1];
            
            if(newrow >= 0 && newrow < board.length && newcol < board[0].length && newcol >= 0
              && (board[newrow][newcol] == 1 || board[newrow][newcol] == -2)){
                active++;
            }
        }
        return active;
    }
    public void gameOfLife(int[][] board) {
        for(int i = 0; i < board.length;i++){
            for(int j = 0; j < board[0].length;j++){
                int activeneigh = getneigh(board ,i ,j);
                if(board[i][j] == 1){
                    if(activeneigh < 2 || activeneigh > 3){
                        board[i][j] = -2; //0
                    }
                }else if(board[i][j] == 0){
                    if(activeneigh == 3){
                        board[i][j] = 3;
                    }
                } 
            }
        }
        update(board);
        return;
    }
}