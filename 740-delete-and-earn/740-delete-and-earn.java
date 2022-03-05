class Solution {
    public int deleteAndEarn(int[] nums) {
        int inc = 0 , exec = 0;
        int[] count = new int[10001];
        
        for(int val : nums)count[val]++;
        
        for(int i = 0; i <= 10000;i++){
            int newinc = exec + count[i]*i;
            int newexec = Math.max(inc , exec);
            
            inc = newinc;
            exec = newexec;
        }
        
        return Math.max(inc , exec);
    }
}