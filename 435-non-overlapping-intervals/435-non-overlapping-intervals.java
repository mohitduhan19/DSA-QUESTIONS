class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a , b)->Integer.compare(a[0],b[0]));
         int count = 0; 
         int ep = intervals[0][1];
         
         for(int idx = 1; idx < intervals.length;idx++){
             if(intervals[idx][0] < ep){
                 count++;
                 if(intervals[idx][1] < ep)
                  ep = intervals[idx][1];
             }
             else{
                 ep = intervals[idx][1];
             }
         }
                    return count;
    }
}