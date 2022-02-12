class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        if(s == null || s.length() == 0 || words == null || words.length == 0){
            return new ArrayList<>();
        }
        
        HashMap<String , Integer> freq = new HashMap<>();
        for(String word : words){
            freq.put(word , freq.getOrDefault(word , 0) + 1);
        }
        
        
        int totalword = words.length;
        int wordlength = words[0].length();
        List<Integer> res = new ArrayList<>();
        
        for(int i = 0;i <= s.length() - totalword*wordlength;i++){
            HashMap<String , Integer> seenword = new HashMap<>();
            
            for(int j = 0;j < totalword;j++){
                int wordidx = i + j*wordlength;
                String word = s.substring(wordidx , wordidx + wordlength);
                
                if(!freq.containsKey(word)){
                    break;
                }
                seenword.put(word , seenword.getOrDefault(word , 0) + 1);
                
                if(seenword.get(word) > freq.get(word)){
                    break;
                }
                if(j + 1 == totalword){
                    res.add(i);
                } 
            }
        }
        return res;
    }
}