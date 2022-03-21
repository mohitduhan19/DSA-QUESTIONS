class Solution {
    public List<Integer> partitionLabels(String s) {
      HashMap<Character , Integer> map = new HashMap<>();
      List<Integer>res = new ArrayList<>();
        int max = 0 , prev = -1;
        
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            map.put(ch , i);
        }
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            max = Math.max(max , map.get(ch));
            if(i == max){
                res.add(max - prev);
                prev = max;
            }
        }
        return res;
    }
}