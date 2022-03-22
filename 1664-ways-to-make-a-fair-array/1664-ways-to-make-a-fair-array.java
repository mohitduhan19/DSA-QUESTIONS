class Solution {
    public int waysToMakeFair(int[] nums) {
        int[]even = new int[nums.length];
        int[]odd = new int[nums.length];
        
        int oddsum = 0;
        int evensum = 0;
        
        for(int i = 0; i < nums.length;i++){
            if(i%2 == 0){
                evensum += nums[i];
            }else{
                oddsum += nums[i];
            }
            odd[i] = oddsum;
            even[i] = evensum;
        }
        int ans = 0;
        for(int i = 0; i < nums.length;i++){
            if(i == 0){
                int nos = even[nums.length -1] - nums[0];
                int nes = odd[nums.length - 1];
                if(nos == nes)ans++;
                continue;
            }
            
            int nes = even[i - 1] + odd[nums.length - 1] - odd[i];
            int nos = odd[i - 1] + even[nums.length - 1] - even[i];
            
            if(nes == nos)ans++;
            
        }
        return ans;
    }
}