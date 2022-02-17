class Solution {
    public String removeKdigits(String s, int k) {
         Stack<Character> stk = new Stack<>();
        
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            while(stk.size() > 0 && k > 0 && stk.peek() > ch){
                stk.pop();
                k--;
            }
            stk.push(ch);
        }
        
        while(k > 0){
            stk.pop();
            k--;
        }
        
        char[] arr = new char[stk.size()];
        int right = arr.length - 1;
        
        while(right >= 0)arr[right--] = stk.pop();
        
        int d = 0;
        while(d < arr.length && arr[d] == '0')d++;
        
        StringBuilder res = new StringBuilder();
        while(d < arr.length)res.append(arr[d++]);
             
        if(res.length() == 0)res.append('0');
             return  res.toString();
        
    }
}