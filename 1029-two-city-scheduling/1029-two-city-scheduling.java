class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs , (a , b)->{
            int adiff = a[0] - a[1];
            int bdiff = b[0] - b[1];
            return adiff - bdiff;
        });
            
        int count = 0 , t = 0;
        for(int i = 0; i < costs.length/2;i++){
             count += costs[i][0];
        }
        
        for(int i = costs.length/2; i < costs.length;i++){
             t += costs[i][1];
           
        }
        return count + t;
    }
}

 // Arrays.sort(costs, (a, b) -> {
 //            int aDiff = a[0] - a[1];
 //            int bDiff = b[0] - b[1];
 //            return aDiff-bDiff;
 //        });