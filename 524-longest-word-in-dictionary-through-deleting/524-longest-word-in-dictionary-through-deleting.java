class Solution {
    public boolean issubsequence(String s , String d){
        int i = 0 , j = 0;
        if(d.length() > s.length())return false;
        while(i < s.length() && j < d.length()){
            if(s.charAt(i) == d.charAt(j))j++;
            i++;
        }
        return j == d.length();
    } 
    public String findLongestWord(String s, List<String> d) {
        String res = "";
        d.sort((String a , String b)->a.length() == b.length()?a.compareTo(b):b.length()-a.length());
        for(String str : d){
            if(issubsequence(s ,str))return res = str;
        }
        return res;
    }
}