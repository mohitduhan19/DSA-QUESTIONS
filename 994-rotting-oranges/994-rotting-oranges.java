class Solution {
    class pair{
        int x;
        int y;
        
        pair(int x , int y){
            this.x = x;
            this.y = y;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<pair> q = new ArrayDeque<>();
        int total = 0 , rotten = 0 , time = 0;
        
        for(int i = 0; i < grid.length;i++){
            for(int j = 0; j < grid[0].length;j++){
               if(grid[i][j] == 1 || grid[i][j] == 2)total++;
                if(grid[i][j] == 2)q.add(new pair(i , j));
            }
        }
        if(total == 0)return 0;
        
        while(q.size() > 0){
           int size = q.size();
            
            rotten += q.size();
            if(rotten == total)return time;
            time++;
            
            while(size-- > 0){
                pair p = q.remove();
                
                if(p.x + 1 < grid.length && grid[p.x + 1][p.y] == 1){
                    grid[p.x + 1][p.y] = 2;
                    q.add(new pair(p.x + 1 , p.y));
                }
                
                 if(p.x - 1 >= 0 && grid[p.x - 1][p.y] == 1){
                    grid[p.x - 1][p.y] = 2;
                    q.add(new pair(p.x - 1 , p.y));
                }
                
                 if(p.y + 1 < grid[0].length && grid[p.x][p.y + 1] == 1){
                    grid[p.x][p.y + 1] = 2;
                    q.add(new pair(p.x, p.y + 1));
                }
                
                 if(p.y - 1 >= 0 && grid[p.x][p.y - 1] == 1){
                    grid[p.x][p.y - 1] = 2;
                    q.add(new pair(p.x, p.y - 1));
                }
              
            }
        }
        return -1;
    }
}