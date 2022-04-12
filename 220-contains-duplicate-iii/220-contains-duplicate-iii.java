class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        final int N = nums.length;
        TreeSet<Long> treeSet = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            long num = nums[i];
            Long floor = treeSet.floor(num + t);
            Long ceil = treeSet.ceiling(num - t);
            if ((floor != null && floor >= num) || (ceil != null && ceil <= num)) {
                return true;
            }
			treeSet.add(num);
            if (i >= k) {
                treeSet.remove((long)nums[i-k]);
            }
        }
        return false;
    }
}