class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length ==0)return false;
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length;i++){
            if(!map.containsKey(nums[i]))map.put(nums[i] , i);
            else return true;
        }
        return false;
    }
}