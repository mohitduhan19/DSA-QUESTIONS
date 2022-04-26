class Solution {
    //Create Edge 
    // Use Prim's Algo
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        PriorityQueue<int []> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]); // PriorityQueue is of int [] of size 3 => int [0]=src.point , int [1] = dest.point ans int [2] = dist between src and dest
        for(int i = 0; i < n; i++){
            pq.add(new int[] {0, i, getDist(points[0], points[i])});
        }
        
        boolean [] vis = new boolean[n];
        vis[0] = true;
        int count = n - 1;
        int cost = 0;
        while( count > 0){
            int [] rem = pq.remove();
            int point = rem[1];
            if(vis[point] == false){
                cost += rem[2];
                count--;
                vis[point] = true;
                for(int j = 0; j < n; j++){
                    if(vis[j] == false){
                        pq.add(new int[] {point, j,  getDist(points[point], points[j])});
                    }
                }
            }   
        }
        return cost;
    }
    
    public int getDist(int [] x, int [] y){
        return Math.abs(x[0] - y[0]) + Math.abs(x[1] - y[1]);
    }
}