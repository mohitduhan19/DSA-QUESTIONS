class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int maxprofit = 0;
        for(int  i = 0; i < profit.length;i++){
            if(map.get(profit[i])!=null && map.get(profit[i])<difficulty[i]){
                continue;
            }
            map.put(profit[i] , difficulty[i]);
        }
        
        int n = profit.length - 1;
        int m = worker.length - 1;
        Arrays.sort(profit);
        Arrays.sort(worker);
        
        while(n >= 0 && m >= 0){
            if(map.get(profit[n]) <= worker[m]){
                maxprofit += profit[n];
                m--;
            }else{
                n--;
            }
        }
        return maxprofit;
    }
}