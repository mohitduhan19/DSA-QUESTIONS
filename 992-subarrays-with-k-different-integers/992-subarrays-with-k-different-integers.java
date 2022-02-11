class Solution {
    public int subarraysWithAtmostk(int[] nums , int k){
        HashMap<Integer , Integer>req = new HashMap<>();
        int count = 0, left  = 0;
        for(int right = 0; right< nums.length;right++){
            req.put(nums[right] , req.getOrDefault(nums[right] , 0) + 1);
            
            while(req.size() > k){
                 req.put(nums[left] , req.getOrDefault(nums[left] , 0) - 1);
                if(req.get(nums[left]) == 0){
                    req.remove(nums[left]);
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subarraysWithAtmostk(nums , k) - subarraysWithAtmostk(nums , k - 1);
    }
}