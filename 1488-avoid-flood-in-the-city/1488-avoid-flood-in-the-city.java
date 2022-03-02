class Solution {
    public int[] avoidFlood(int[] rains) {
        HashMap<Integer , Integer> lastrain = new HashMap<>();
        TreeSet<Integer> dry = new TreeSet<>();
        int n = rains.length;
        int[] ans = new int[n];
        
        for(int i = 0; i < n;i++){
            int x = rains[i];
            if(x == 0){
                dry.add(i);
                ans[i] = 1;
            }else{
                Integer id = lastrain.get(x);
                if(id == null){
                    lastrain.put(x , i);
                }else{
                    Integer drythisday = dry.higher(id);
                    if(drythisday == null){
                        return new int[0];
                    }
                    ans[drythisday] = x;
                    dry.remove(drythisday);
                    
                    lastrain.put(x , i);
                }
                  ans[i] = -1;

            }
            
        }
        return ans;
    }
}