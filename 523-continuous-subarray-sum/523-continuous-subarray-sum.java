class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        long sum=0;
        map.put(0,-1); 
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int key = (int)sum%k;
            if(map.containsKey(key)){
                if(i-map.get(key)>=2)
                    return true;
            }
            else
                map.put(key,i);
        }
        return false;
    }
}