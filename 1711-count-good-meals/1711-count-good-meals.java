class Solution {
    public int countPairs(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int cnt = 0;
        for(int i  = 0; i < nums.length;i++){
            int pow = 1;
            for(int j = 0; j <=21;j++){
                if(map.containsKey(pow - nums[i])){
                    cnt += map.get(pow - nums[i]);
                    cnt = cnt%1000000007;
                }
                pow*=2;
                
            }
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        return cnt;
    }
}

