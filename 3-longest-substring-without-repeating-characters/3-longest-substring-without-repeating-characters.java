class Solution {
  public int lengthOfLongestSubstring(String s) {
      HashMap<Character , Integer> freq = new HashMap<>();
      int left = 0 , maxlen = 0;
      
      for(int right = 0; right < s.length();right++){
          char ch = s.charAt(right); 
          freq.put(ch , freq.getOrDefault(ch , 0) + 1);
          while(freq.get(ch) > 1){
              char chl = s.charAt(left);
              freq.put(chl , freq.getOrDefault(chl , 0) - 1);
               left++;
          }
          maxlen = Math.max(maxlen , right - left + 1);
      }
      return maxlen;
    }
}