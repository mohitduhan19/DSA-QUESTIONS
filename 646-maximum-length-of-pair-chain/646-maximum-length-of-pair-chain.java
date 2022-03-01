class Solution {
    public int findLongestChain(int[][] pairs) {
         Arrays.sort(pairs,(a , b)->Integer.compare(a[1],b[1]));
         int count = 0; 
         int limit = Integer.MIN_VALUE;
         
         for(int i = 0; i < pairs.length;i++){
             if(limit < pairs[i][0]){
                 limit = pairs[i][1];
                 count++;
             }
         }
        return count;
    }
}