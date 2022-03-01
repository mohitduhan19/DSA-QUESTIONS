class Solution {
    public int findMinArrowShots(int[][] points) {
         Arrays.sort(points,(a , b)->Integer.compare(a[1],b[1]));
         int count = 0; 
         int limit = Integer.MIN_VALUE;
         
         for(int i = 0; i < points.length;i++){
             if(limit < points[i][0]){
                 limit = points[i][1];
                 count++;
             }
         }
        if(limit == Integer.MIN_VALUE)return 1;
        return count;
    }
}