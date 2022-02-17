class Solution {
    public int[][] intervalIntersection(int[][] firstlist, int[][] secondlist) {
         List<int[]> res = new ArrayList<>();
        int ptr1 = 0 , ptr2 = 0;
        while(ptr1 < firstlist.length && ptr2 < secondlist.length){
            int csp = Math.max(firstlist[ptr1][0] , secondlist[ptr2][0]);
            int cep = Math.min(firstlist[ptr1][1] , secondlist[ptr2][1]);
            
            if(csp <= cep){
                int[] interval = {csp , cep};
                res.add(interval);
            }
            if(firstlist[ptr1][1] < secondlist[ptr2][1]){
                ptr1++;
            }else{
                ptr2++;
            }
        }
        
        return res.toArray(new int[res.size()][]);
    }
}