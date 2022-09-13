class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int[] LIS = new int[nums.length];
        int[] LDS = new int[nums.length];
        int Om = 0;
        for(int i = 0; i < nums.length;i++){
            int max = 0;
            for(int j = 0; j < i;j++){
                if(nums[j] < nums[i]){
                   if(LIS[j] > max){
                       max = LIS[j];
                   }
                }
            }
                LIS[i] = max + 1;
            if(LIS[i] > Om){
                Om = LIS[i];
            }
        }
        
          Om = 0;
        for(int i = nums.length - 1; i >= 0;i--){
            int max = 0;
            for(int j = i + 1; j < nums.length;j++){
                if(nums[j] < nums[i]){
                   if(LDS[j] > max){
                       max = LDS[j];
                   }
                }
            }
                LDS[i] = max + 1;
            if(LDS[i] > Om){
                Om = LDS[i];
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length;i++){
            if(LIS[i] == 1 || LDS[i] == 1)continue;
            int x = nums.length - (LIS[i] + LDS[i] - 1);
            ans = Math.min(ans , x);
        }
        return ans;
    }
}