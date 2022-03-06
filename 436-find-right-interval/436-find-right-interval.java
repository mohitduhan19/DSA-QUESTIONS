class Solution {
    public int binary(int[] arr , int target){
        int left = 0, right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            
            if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }
    public int[] findRightInterval(int[][] intervals) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int[]first = new int[intervals.length];
        for(int i = 0; i < intervals.length;i++){
            map.put(intervals[i][0] , i);
            first[i] = intervals[i][0];
        }
        
        Arrays.sort(first);
        
        int[]ans = new int[intervals.length];
        for(int i = 0; i < intervals.length;i++){
            int key = binary(first , intervals[i][1]);
            if(key == first.length)
                ans[i] = -1;
            
            else if(key == 0){
                if(intervals[i][1] <= first[0])
                    ans[i] = map.get(first[0]);
                else{
                ans[i] = -1;
                }
            }
            else{
                ans[i] = map.get(first[key]);
            }
        }
        return ans;
    }
}