class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return cnt(nums, k) - cnt(nums, k-1);
    }
    public int cnt(int[] nums, int k) {
        int n = nums.length, odd = 0, ans = 0;
        for (int l = 0, r = 0; r<n; r++) {
            odd += nums[r] % 2;
            while (odd>k) {
                odd -= nums[l] % 2;
                l++;
            }
            ans += (r-l+1);
        }
        return ans;
    }
}