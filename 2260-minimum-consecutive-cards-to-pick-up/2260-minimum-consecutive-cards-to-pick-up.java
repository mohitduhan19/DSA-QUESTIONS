class Solution {
    public int minimumCardPickup(int[] cards) {
           int[] lastindex = new int[1000001];
        int min = Integer.MAX_VALUE;
        Arrays.fill(lastindex , -1);
        for(int i = 0; i < cards.length;i++){
            if(lastindex[cards[i]] != -1){
                min = Math.min(i - lastindex[cards[i]] + 1 , min);
            }
            lastindex[cards[i]] = i;
        }
        return min == Integer.MAX_VALUE?-1:min;
    }
}

