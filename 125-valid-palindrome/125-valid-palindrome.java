class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i< s.length();i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                str.append(s.charAt(i));
            }
            
        }
        int n = str.length() - 1;
         for(int i = 0; i< str.length()/2;i++){
             if(str.charAt(i) != str.charAt(n - i))return false;
         }
        return true;
    }
}