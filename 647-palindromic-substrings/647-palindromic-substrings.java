class Solution {
   public int countSubstrings(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int count = s.length();
        int l;
        int h;
        for(int i = 0; i < s.length(); i++){
		    // even
            l = i;
            h = i + 1;
            while(l >= 0 && h < s.length() && s.charAt(l--) == s.charAt(h++)){
                count++;
            }
			// odd
            l = i - 1;
            h = i + 1;
            while(l >= 0 && h < s.length() && s.charAt(l--) == s.charAt(h++)){
                count++;
            }
        }
        return count;
    }
}