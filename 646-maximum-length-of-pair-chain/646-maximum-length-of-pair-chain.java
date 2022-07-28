class Solution {
    class pair{
        int left;
        int right;
        pair(int left ,  int right){
            this.left = left;
            this.right = right;
        }
    }
    
    public class MyComparator implements Comparator<pair>{
        public int compare(pair obj1 , pair obj2){
            if(obj1.right != obj2.right){
                return obj1.right - obj2.right;
            }
            return obj1.left - obj2.left;
        }
    }
    public int findLongestChain(int[][] pairs) {
       pair[]interval = new pair[pairs.length];
       for(int i = 0;i < pairs.length;i++){
           interval[i] = new pair(pairs[i][0] , pairs[i][1]);
       } 
        Arrays.sort(interval , new MyComparator());
        int count = 0 , limit = Integer.MIN_VALUE;
        for(int i = 0; i < interval.length;i++){
            if(limit < interval[i].left){
                count++;
                limit = Math.max(limit , interval[i].right);
            }
        }
        return count;
    }
}