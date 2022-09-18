class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int[] dp = new int[nums.length];
        int overallMax = 0 , prev = 0 , idx = 0;;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length;i++){
            int max = 0;
            for(int j = 0; j < i;j++){
                if(nums[j] < nums[i] && nums[i]%nums[j] == 0) {
                    if(dp[j] > max){
                    max = dp[j];
                    }
                }
                }
               dp[i] = max + 1;
                if(dp[i] >  overallMax){
                    overallMax = dp[i];
                    prev = nums[i];
                    idx = i;
            }
        }
        
        List<Integer> res = new ArrayList<>();
       
        for(int i = idx; i>= 0;i--){
            if(dp[i] == overallMax && (prev % nums[i] == 0)){
                res.add(nums[i]);
                prev = nums[i];
                overallMax--;
            }
        }
        return res;
    }
}