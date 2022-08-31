class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        
        for(int val : map.keySet()){
            int x = map.get(val);
            if(x > 1)return val;
        }
        return -1;
    }
}