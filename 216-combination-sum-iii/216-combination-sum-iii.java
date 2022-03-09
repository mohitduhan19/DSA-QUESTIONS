class Solution {
    public void back(int[]arr , List<List<Integer>>ans , List<Integer> curr ,int k , int n ,int idx){
        if(n == 0 && curr.size() == k){
             ans.add(new ArrayList(curr));
                return;
        }
        
        for(int i = idx ; i <= arr.length;i++){
                curr.add(i);
                back(arr , ans , curr , k , n - i , i +1 );
                curr.remove(curr.size() - 1);
        }  
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int[] arr = { 1 , 2 , 3 , 4 , 5, 6, 7 , 8 ,9};
        back(arr , ans , curr, k ,n ,1);
        return ans;
    }
}