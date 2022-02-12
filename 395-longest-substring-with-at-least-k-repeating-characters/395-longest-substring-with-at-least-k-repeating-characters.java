class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length() == 0 || s.length() < k)return 0;
        
        HashMap<Character ,Integer> count = new HashMap<>();
        
        for(char ch : s.toCharArray()){
            count.put(ch , count.getOrDefault(ch , 0) + 1);
        }
        int i = 0;
        while(i < s.length() && count.get(s.charAt(i)) >= k){
            i++;
        }
        if(i >= s.length() - 1)return i;
        
        int leftSubstring = longestSubstring(s.substring(0 , i) ,k);
        while(i < s.length() - 1 && count.get(s.charAt(i)) < k)i++;
        int rightSubString = longestSubstring(s.substring(i) , k);
        return Math.max(leftSubstring , rightSubString);
            
    }
}