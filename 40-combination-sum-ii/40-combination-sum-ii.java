class Solution {
      public void findAllCombinations(int[] arr, int tar, int idx, List<Integer> smallAns, List<List<Integer>> res , boolean[] visited) {
        if (tar == 0) {
            if(!res.contains(smallAns)){
           res.add(new ArrayList(smallAns));
            return;
        }
        }
        
        
        for (int i = idx; i < arr.length; ++i) {
            if(i > idx && arr[i] == arr[i-1]) continue;
            if ( tar - arr[i] >= 0) {
                visited[i] = true;
                smallAns.add(arr[i]);
                findAllCombinations(arr, tar - arr[i], i + 1, smallAns, res , visited);
                smallAns.remove(smallAns.size() - 1);
                visited[i] = false;
            }
        }
       
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>> res = new ArrayList<>();
        List<Integer> smallAns = new ArrayList<>();
        
        Arrays.sort(candidates);
        boolean[]vis = new boolean[candidates.length];
        findAllCombinations(candidates, target, 0, smallAns, res , vis);
        return res;
    }
}