class Solution {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> resultList=new ArrayList();
        Arrays.sort(nums);
        backTrack(resultList,new ArrayList(),nums,0);
        return resultList;
    }
    
    private void backTrack(List<List<Integer>> resultList, List<Integer> currentList, int []nums, int start) {
	    resultList.add(new ArrayList(currentList));
        for(int i=start;i<nums.length;i++)  {
            if(i>start&&nums[i]==nums[i-1]) continue; // to avoid duplicates
            currentList.add(nums[i]);
            backTrack(resultList,currentList,nums,i+1);
            currentList.remove(currentList.size()-1);
        }
    }

}


