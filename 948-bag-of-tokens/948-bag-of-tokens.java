class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
     Arrays.sort(tokens);
        int left = 0, right = tokens.length - 1 , maxscore = 0 , score = 0;
        
        while(left <= right){
            if(power >= tokens[left]){
                power -= tokens[left];
                left++;
                score++;
                maxscore =Math.max(maxscore , score);
            }else if(score > 0){
                power += tokens[right];
                right--;
                score--;
            }else{
                break;
            }
        }
        return maxscore;
    }
}