class Solution {
    public int[] getAverages(int[] nums, int k) {
        long[] prefix = new long[nums.length];
        int radius = (2*k) + 1;
        prefix[0] = nums[0];
        for(int i = 1; i< nums.length;i++){
            prefix[i] = prefix[i - 1] + nums[i ];
        }
        
        int[] res = new int[nums.length];
        Arrays.fill(res , -1);
        
        for(int i = k;i < nums.length - k;i++){
            long t = (prefix[i + k] - prefix[ i - k] + nums[i - k])/radius;
            res[i] = (int)t;
        }
        return res;
    }
}