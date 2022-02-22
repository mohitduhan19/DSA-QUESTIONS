class Solution {
    public int titleToNumber(String s) {
        int res = 0;
        for(char ch : s.toCharArray()){
            int d = ch - 'A' + 1;
            res = res *26 + d;
        }
        return res;
    }
}