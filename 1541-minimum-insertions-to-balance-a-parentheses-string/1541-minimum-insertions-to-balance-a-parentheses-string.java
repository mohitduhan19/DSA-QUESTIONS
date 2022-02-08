class Solution {
    public int minInsertions(String s) {
        int open  = 0 , insert = 0;
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            
            if( ch == '('){
                open++;
            }else{
                if(open > 0)
                    open--;
                else insert++;
                
                if(i + 1 < s.length() && s.charAt(i + 1) == ')'){
                    i++;
                  
                }  else insert++;
            }
        }
        return insert + 2*open;
    }
}