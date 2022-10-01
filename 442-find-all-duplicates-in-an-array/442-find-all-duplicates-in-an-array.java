class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        if(nums.length == 1)return new ArrayList<>();
        HashMap<Integer , Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length;i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        
       for(int key : map.keySet()){
           int val = map.get(key);
           if(val > 1)ans.add(key);
       }
        return ans;
    }
}