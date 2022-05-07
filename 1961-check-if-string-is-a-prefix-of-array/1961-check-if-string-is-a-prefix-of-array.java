class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String str = "";
        for(String w : words){
            str += w;
            if(s.equals(str))return true;
        }
         return false;
    }
}