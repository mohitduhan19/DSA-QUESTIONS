 class Solution {    
    class pair{
        char ch;
        int occ;
        
        public pair(char ch , int occ){
            this.ch = ch;
            this.occ = occ;
        }
    }
    public String removeDuplicates(String s, int k) {
          Stack<pair>stk = new Stack<>();
        
         for(int i = s.length() - 1; i >= 0; i--){
             char ch = s.charAt(i);
             if(stk.size() == 0){
                 stk.push(new pair(ch , 1));
             }else{
                 if(ch == stk.peek().ch){
                     if(stk.peek().occ == k - 1){
                         stk.pop();
                     }else{
                         stk.peek().occ++;
                     }
                 }else{
                     stk.push(new pair(ch , 1));
                 }
             }
         }
        StringBuilder str = new StringBuilder();
        while(stk.size() > 0){
            int loop = stk.peek().occ;
            char ch = stk.pop().ch;
            while(loop-- > 0){
                str.append(ch);
            }
        }
     return str.toString();
        
//         int count = 1;
//         for(int i =1; i <  s.length(); i++){
          
//             if(s.charAt(i - 1) == s.charAt(i)){
//                 count++;
//             }
//             else{
//                 count = 1;
//             }
//             if(count == k){
//                 String reduce = s.substring(0 , i - k + 1) + s.substring(i + 1);
//                 return removeDuplicates(reduce , k);
//             }
//         }
//         return s;
    }
}