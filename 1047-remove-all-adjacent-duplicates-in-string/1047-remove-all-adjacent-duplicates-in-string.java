class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>stk = new Stack<>();
        
        for(int i = s.length() - 1 ;i >= 0;i--){
            char ch = s.charAt(i);
            if(stk.size() == 0)
            stk.push(ch);
            
          else if(stk.peek() != ch)stk.push(ch);
            else{
                stk.pop();
            }
        }
        
       StringBuilder str = new StringBuilder();
        //String str = "";
        while(stk.size() > 0){
            str.append(stk.peek());
            stk.pop();
        }
        
        return str.toString();
    }
}