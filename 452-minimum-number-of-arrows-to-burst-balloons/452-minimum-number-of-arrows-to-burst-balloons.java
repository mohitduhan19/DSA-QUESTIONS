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
            if(obj1.right < obj2.right)return -1;
            
            return 1;
        }
    }
    
    public int findMinArrowShots(int[][] points) {
        
        pair[] arrow = new pair[points.length];
        for(int i = 0; i < points.length;i++){
            arrow[i] = new pair(points[i][0] , points[i][1]);
        }
        
        Arrays.sort(arrow , new MyComparator());
        
        int count = 1 ,limit = arrow[0].right;
        for(int i = 1;i < arrow.length;i++){
            if(limit < arrow[i].left){
                count++;
                limit = Math.max(limit , arrow[i].right);
            }
           
        }
        return count;
    }
}