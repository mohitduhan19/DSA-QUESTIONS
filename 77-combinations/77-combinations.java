class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> output = new ArrayList<>();
        backtrack(n,k,1,output,new ArrayList<>());            
       
        return output;
    }
    
    public void backtrack(int n,int k,int start,List<List<Integer>> output,List<Integer> list){
        
        if(k == 0){
            output.add(new ArrayList<Integer>(list));
        }
        
        for(int i = start; i <= n; i++){
            list.add(i);
            // do k-1 and i+1 simultenously
            backtrack(n,k-1,i+1,output,list);
            list.remove(list.size()-1);
        }
        
    }
    
}
