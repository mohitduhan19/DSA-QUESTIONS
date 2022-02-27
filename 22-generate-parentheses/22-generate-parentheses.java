class Solution {
    public void FindAllParenthesis(String curr , int open , int close , List<String>res , int n){
        if(curr.length() == 2*n){
            res.add(curr);
            return;
        }
        if(open < n)FindAllParenthesis(curr + "(" , open + 1 , close ,res , n);
        if(close < open)FindAllParenthesis(curr + ")" , open , close + 1 , res , n);
        
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList();
        FindAllParenthesis("(" , 1 , 0 , res, n);
        return res;
    }
}