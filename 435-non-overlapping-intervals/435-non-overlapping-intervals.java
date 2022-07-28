class Solution {
    class pair{
        int start;
        int end;
        pair(int start , int end){
            this.start = start;
            this.end = end;
        }
    }
    
    public class MyComparator implements Comparator<pair>{
        public int compare(pair obj1 , pair obj2){
            if(obj1.end != obj2.end){
                return obj1.end - obj2.end;
            }
            return obj1.start - obj2.start;
        }
    }
    public int eraseOverlapIntervals(int[][] intervals) {
        pair[] pairs = new pair[intervals.length];
        for(int i = 0; i < intervals.length;i++){
            pairs[i] = new pair(intervals[i][0] , intervals[i][1]);
        }
          Arrays.sort(pairs , new MyComparator());
        int endlimit = Integer.MIN_VALUE , count = 0;
        for(int i = 0; i < pairs.length;i++){
            if(endlimit <= pairs[i].start){
                count++;
                endlimit = pairs[i].end;
            }
        }
        return pairs.length - count;
    }
}