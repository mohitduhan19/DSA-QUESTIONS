class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        int soldiers = 0;
        int[] res = new int[k];
        
        for(int [] row : mat){
            int low = 0 , high = row.length ;
            while(low < high){
                int mid = low + (high - low)/2;
                
                if(row[mid] != 0)low = mid + 1;
                else high = mid;
            }
            
            pq.add(new int[]{low , soldiers++});
        }
        
        for(int i = 0 ; i< k;i++){
            res[i] = pq.remove()[1];
        }
        return res;
    }
}