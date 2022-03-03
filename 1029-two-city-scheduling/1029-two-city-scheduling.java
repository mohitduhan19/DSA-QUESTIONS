class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs , (a , b)->{
            int adiff = a[0] - a[1];
            int bdiff = b[0] - b[1];
            return adiff - bdiff;
        });
            
        int cityA = 0 , cityB = 0 , mincost = 0;
        for(int i = 0; i < costs.length/2;i++){
             cityA += costs[i][0];
        }
        
        for(int i = costs.length/2; i < costs.length;i++){
             cityB += costs[i][1];
           
        }
        return mincost = cityA + cityB;
    }
}

 