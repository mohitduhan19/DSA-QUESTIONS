class Solution {
    public int[] asteroidCollision(int[] asteroids) {
          Stack<Integer> stk = new Stack<>();
        for(int val : asteroids){
            if(val > 0){
                stk.push(val);
            }else{
                while(stk.size() > 0 && stk.peek() > 0 && stk.peek() < -val){
                    stk.pop();
                }
                if(stk.size() > 0 && stk.peek() == -val){
                    stk.pop();
                }else if(stk.size() > 0 && stk.peek() > -val){
                    
                }
                else{
                    stk.push(val);
                }
                
                
            }
        }
        
        int[] ans = new int[stk.size()];
        int i = ans.length - 1;
        while(i >= 0)ans[i--] = stk.pop();
        return ans;
    }
}