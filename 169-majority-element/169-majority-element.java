class Solution {
    public int getval(int[] nums){
        int value = nums[0], count = 1;
        for(int i = 1; i< nums.length;i++){
            if(nums[i] == value){
                count++;
            }else{
                count--;
            }
            if(count  == 0){
                value = nums[i];
                count = 1;
            }
        }
        //System.out.print(value);
        return value;
    }
    public int majorityElement(int[] nums) {
       //  HashMap<Integer , Integer> map = new HashMap<>();
       // for(int i = 0; i< nums.length;i++){
       //      map.put(nums[i] , map.getOrDefault(nums[i] ,0) + 1);
       // }
       //  int majority = nums.length/2;
       //  for(int freq : map.keySet()){
       //      if(map.get(freq) > majority){
       //          return freq;
       //      }
       //  }
       //  return -1;
        
        int value = getval(nums);
        int count  = 0, majority = nums.length/2;
        
        for(int i = 0; i< nums.length;i++){
            if(nums[i] == value){
                count++;
            }
        }
        
        if(count > majority){
            return value;
        }
        return -1;
    }
} 