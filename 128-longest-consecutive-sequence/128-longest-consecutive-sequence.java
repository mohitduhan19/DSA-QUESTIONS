class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer , Boolean> map = new HashMap<>();
        if(nums.length == 0)return 0;
        for(int i = 0; i < nums.length;i++){
            map.put(nums[i] , true);
        }
        
        for(int i = 0; i < nums.length;i++){
           if(map.containsKey(nums[i] - 1)){
               map.put(nums[i] , false);
           }
        }
        
        int maxlen = 1;
        
        for(int i = 0; i < nums.length;i++){
            int len = 1;
            if(map.get(nums[i]) == true){
                while(map.containsKey(nums[i] + len)){
                    len++;
                }
                if(len > maxlen)maxlen = len;
            }
        }
        return maxlen;
    }
}