class Solution {
    public void recur(int sr , int n){
      
        if(n == 0){
            count++;
            return;
        }
        for(int i = sr ; i < 5 ;i++){
        recur(i , n - 1);
    }
   
    }
    int count;
    public int countVowelStrings(int n) {
         count = 0;
        recur(0 , n);
        return count;
    }
}