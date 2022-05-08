class Solution {
    public String largestGoodInteger(String s) {
      String str = "";
        for(int i = 0; i < s.length() - 2;i++){
            if(s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i + 2)){
                 if(s.substring(i , i + 3).compareTo(str) > 0)
                     str = s.substring(i , i + 3);
            }
        }
        return str;
    }
}

