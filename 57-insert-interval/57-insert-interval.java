class Solution {
    public int[][] insert(int[][] intervals, int[] newinterval) {
        ArrayList<int[]> res = new ArrayList<>();
        
        int idx = 0;
        while(idx < intervals.length){
            if(intervals[idx][0] < newinterval[0]){
                res.add(intervals[idx]);
                idx++;
            }else{
                break;
            }
        }
        
        if(res.size() == 0 || (newinterval[0] > res.get(res.size() - 1)[1])){
            res.add(newinterval);
        }else{
            int lastinterval[] = res.get(res.size() - 1);
            lastinterval[1] = Math.max(lastinterval[1] , newinterval[1]);
            
        }
        
        while(idx < intervals.length){
            int lastinterval[] = res.get(res.size() - 1);
            if(lastinterval[1] >= intervals[idx][0]){
                lastinterval[1] = Math.max(lastinterval[1] , intervals[idx][1]);
            }else{
                res.add(intervals[idx]);
            }
            idx++;
        }
        
        return res.toArray(new int[res.size()][]);
    }
}