class Solution {
    public int minDominoRotations(int[] top, int[] bottom) {
       int num1 = top[0] , num2 = bottom[0],count1 = 0 , count2 = 0 , count3 = 0, count4 = 0;
   
        for(int i = 0; i < top.length;i++){
            if(count1 != Integer.MAX_VALUE){
                if(top[i] == num1){
                    // continue;
                }
                else if(bottom[i] == num1){
                    count1++;
                }else{
                    count1 = Integer.MAX_VALUE;
                }
            }
              if(count2 != Integer.MAX_VALUE){
                if(bottom[i] == num1){
                    // continue;
                }
                else if(top[i] == num1){
                    count2++;
                }else{
                    count2 = Integer.MAX_VALUE;
                }
            }
            
            if(count3 != Integer.MAX_VALUE){
                if(bottom[i] == num2){
                    // continue;
                }
                else if(top[i] == num2){
                    count3++;
                }else{
                    count3 = Integer.MAX_VALUE;
                }
            }
             if(count4 != Integer.MAX_VALUE){
                if(top[i] == num2){
                    // continue;
                }
                else if(bottom[i] == num2){
                    count4++;
                }else{
                    count4 = Integer.MAX_VALUE;
                }
            }
           
        }
        int res = Math.min(Math.min(count1 , count2) ,Math.min( count3 , count4));
        //if(res == Integer.MAX_VALUE)return -1;
            return res == Integer.MAX_VALUE?-1:res;
    }
} 