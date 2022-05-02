class Solution {
    public boolean canCross(int[] stones) {
        HashMap<Integer , HashSet<Integer>> map = new HashMap<>();
        for(int i = 0 ; i < stones.length;i++){
            map.put(stones[i] , new HashSet<>());
        }
        map.get(stones[0]).add(1);
        
        for(int i = 0; i < stones.length;i++){
            int currstone = stones[i];
            HashSet<Integer> jumps = map.get(currstone);
            for(int jump : jumps){
                int pos = currstone + jump;
                if(pos == stones[stones.length - 1])return true;
                if(map.containsKey(pos) == true){
                    if(jump - 1 > 0)map.get(pos).add(jump - 1);
                    map.get(pos).add(jump);
                    map.get(pos).add(jump + 1);
                }
            }
        }
        return false;
    }
}