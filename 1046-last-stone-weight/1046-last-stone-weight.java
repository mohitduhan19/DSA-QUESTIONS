class Solution{
public int lastStoneWeight(int[] stones) {
        int len = stones.length;
        
        if (len < 2) {
            return stones[0];
        }
        
        Arrays.sort(stones);
        while(stones[len - 2] > 0) {
            int stoneS = stones[len - 2];
            int stoneB = stones[len - 1];
            if (stoneS == stoneB) {
                stones[len - 1] = 0;
            } else {
                stones[len - 1] = stoneB - stoneS;
            }
            stones[len - 2] = 0;
            Arrays.sort(stones);
        }
        return stones[len - 1];
    }
}