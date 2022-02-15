class Solution {
    public int[][] merge(int[][] intervals) {
         Arrays.sort(intervals ,(a ,b)->Integer.compare(a[0],b[0]));
        List<int[]> list = new ArrayList<>();
        
        for(int[] interval : intervals){
            if(list.size() == 0){
                list.add(interval);
            }else{
                int previnterval[] = list.get(list.size() - 1);
                if(interval[0] <= previnterval[1]){
                    previnterval[1] = Math.max(previnterval[1] , interval[1]);
                    
                }else{
                    list.add(interval);
                }
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}