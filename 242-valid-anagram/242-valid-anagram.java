class Solution {
    public boolean isAnagram(String s, String t) {
      HashMap<Character , Integer> map1 = new HashMap<>();
      for(int i = 0; i< t.length();i++){
          char ch = t.charAt(i);
          map1.put(ch , map1.getOrDefault(ch , 0) + 1);
      }  
        
        HashMap<Character , Integer> map2 = new HashMap<>();
        for(int i = 0; i< s.length();i++){
            char ch = s.charAt(i);
            map2.put(ch , map2.getOrDefault(ch , 0) + 1);
        }
        if(map1.equals(map2)){
            return true;
        }
        return false;
    }
}