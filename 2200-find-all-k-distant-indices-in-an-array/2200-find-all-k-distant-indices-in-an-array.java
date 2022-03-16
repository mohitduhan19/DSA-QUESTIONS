class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0, p = 0; i < nums.length;) {
            while(p < nums.length && nums[p] != key) {
                p++;
            }
            if(p >= nums.length) {
                return ans;
            }
            while(i < p && Math.abs(i - p) > k) {
                i++;
            }
            while(i < nums.length && Math.abs(i - p) <= k) {
                ans.add(i);
                i++;
            }
            p++;
        }
        return ans;
    }
}