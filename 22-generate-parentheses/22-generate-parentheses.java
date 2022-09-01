class Solution {
    public void paran(List<String> ans , String curr , int open , int close , int n){
        if(curr.length() == 2*n){
            ans.add(curr);
            return ;
        }
        if(open < n)paran(ans , curr + '(' , open + 1 , close , n);
        if(close < open)paran(ans , curr + ')' , open , close + 1 , n);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        int open = 1 , close = 0;
        paran(ans , "(" , open , close , n);
        return ans;
    }
}