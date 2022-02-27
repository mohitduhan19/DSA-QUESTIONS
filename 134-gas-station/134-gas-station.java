class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int surpulus = 0;
        int total = 0;
        int start = 0;
        for(int i = 0; i < gas.length;i++){
            surpulus += gas[i] - cost[i];
            total += gas[i] - cost[i];
            
            if(surpulus < 0){
                surpulus = 0;
                start = i + 1;
            }
        }
        return (total < 0)?-1:start;
    }
}