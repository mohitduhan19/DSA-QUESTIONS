class Solution {
    class pair{
        String s;
        int freq;
        
        pair(String s , int freq){
            this.s = s;
            this.freq = freq;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
         List<String> ans = new ArrayList<>();
        Map<String , Integer> map = new HashMap<>();
        
        for(int i = 0; i < words.length;i++){
            map.put(words[i] , map.getOrDefault(words[i] , 0) + 1);
        }
        
        PriorityQueue<pair> pq = new PriorityQueue<>(new Comparator<pair>(){
            public int compare(pair a , pair b){
                if(a.freq == b.freq){
                    return a.s.compareTo(b.s);
                }else{
                    return b.freq - a.freq;
                }
            }
        });
        
        for(Map.Entry<String, Integer>entry:map.entrySet()){
            pq.add(new pair(entry.getKey(),entry.getValue()));
        }
        
        for(int i = 0; i < k;i++){
            pair p = pq.remove();
            ans.add(p.s);
        }
        return ans;
    }
}