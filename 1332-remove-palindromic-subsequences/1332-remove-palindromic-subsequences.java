class Solution {
    public int removePalindromeSub(String s) {
       return palindrome(s)?1:2;
    }
    public boolean palindrome(String str){
        int l = 0 , r = str.length() - 1;
        
        while(l < r){
            if(str.charAt(l) !=str.charAt(r))return false;
            l++;r--;
        }
        return true;
    }
}
