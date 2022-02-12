class Solution {
    public int helper(String s , int k , char x){
        int left = 0, maxlen = 0, replacement = 0;
        for(int right = 0; right< s.length();right++){
            char ch = s.charAt(right);
            if(ch != x){
                replacement++;
            }
           while(replacement > k){
               if(s.charAt(left) != x){
                   replacement--;
                   
               }   
               left++;
           }
            maxlen = Math.max(maxlen , right - left + 1);
        }
        return maxlen;
    }
    public int characterReplacement(String s, int k) {
    int ans = 0;
        for(int i = 0; i<26;i++){
            ans =  Math.max(ans , helper(s , k , (char)(i + 'A') ));
        }
        return ans;
    }
}