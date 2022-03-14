class Solution {
    public boolean isAlphabet(char ch){
        return( ch >= 'a' &&  ch <= 'z') || ( ch >= 'A' &&  ch <= 'Z');
    }
    public String reverseOnlyLetters(String s) {
       int left = 0 , right = s.length() - 1;
        StringBuilder res = new StringBuilder(s);
        
        while(left <= right){
            if(!isAlphabet(s.charAt(left))){
                left++;
                continue;
            }else if(!isAlphabet(s.charAt(right))){
                right--;
                continue;
            }else{
                res.setCharAt(left , s.charAt(right));
                res.setCharAt(right , s.charAt(left));
                
            }
            left++;right--;
        }
      return res.toString();
    }
}