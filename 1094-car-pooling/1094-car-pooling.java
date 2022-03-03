class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int lastDropLocation = 0;
        for(int[]trip : trips){
            lastDropLocation = Math.max(lastDropLocation , trip[2]);
        }
        
        int[] highway = new int[lastDropLocation + 1];
        for(int[] trip : trips){
            highway[trip[1]] += trip[0];
            highway[trip[2]] -= trip[0];
        }
        int passengers = 0;
        for(int i = 0; i < highway.length;i++){
            passengers += highway[i];
            if(passengers > capacity)return false;
        }
        return true;
    }
}