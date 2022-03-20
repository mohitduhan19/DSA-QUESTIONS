class Solution {
    public int countCollisions(String directions) {
        int collision = 0;
        Stack<Character> stk = new Stack<>();
        stk.push(directions.charAt(0));
        for(int i = 1; i < directions.length();i++){
            char cur = directions.charAt(i);
            
            if(stk.peek() == 'R' && cur == 'L'){
                collision += 2;
                stk.pop();
                cur = 'S';
            }else if(stk.peek() == 'S' && cur == 'L'){
                collision += 1;
                cur = 'S';
            }
            while(stk.size() > 0 && (stk.peek() == 'R' && cur == 'S')){
                collision += 1;
                stk.pop();
            }
            stk.push(cur);
            
        }
                  return collision;
    }
}