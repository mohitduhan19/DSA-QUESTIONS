class Solution {
    public boolean isgreater(int[] nums , int val){
        int maj = nums.length/3;
        int count = 0;
        for(int elem : nums){
            if(elem == val){
                count++;
            }
        }
        return count > maj;
    }
    
    public List<Integer> majorityElement(int[] nums) {
      List<Integer> ans = new ArrayList<>();
      int val1 = nums[0] , count1 = 1;
      int val2 = nums[0], count2 = 0;
         
         for(int i = 1; i < nums.length;i++){
             if(nums[i] == val1){
                 count1++;
             }else if(nums[i] == val2){
                 count2++;
             }else{
                 if(count1 == 0){
                     val1 = nums[i];
                     count1 = 1;
                 }else if(count2 == 0){
                     val2 = nums[i];
                     count2 = 1;
                 }else{
                     count1--;count2--;
                 }
             }
         }
         if(isgreater(nums , val1) == true){
             ans.add(val1);
         } 
          if(val1 != val2 && isgreater(nums , val2) == true){
             ans.add(val2);
         } 
         return ans;
    }
}