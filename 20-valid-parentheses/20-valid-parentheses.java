class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            if(ch == ')'){
             if(stk.size() > 0 && stk.peek() == '('){
                 stk.pop();
             }else{
                 return false;
             }
            }else if(ch == '}'){
                if(stk.size() > 0 && stk.peek() == '{'){
                    stk.pop();
                }else{
                    return false;
                }
            }else if(ch == ']'){
                if(stk.size() > 0 && stk.peek() == '['){
                    stk.pop();
                }else{
                    return false;
                }
            }else
            stk.push(ch);
        }
        if(stk.size() == 0)return true;
        return false;
    }
}