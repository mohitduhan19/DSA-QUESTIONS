class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum = 0 , maxsum = 0;
        for(int i = 0; i < grumpy.length;i++){
            sum += grumpy[i] == 0?customers[i]:0;
        }
        
        for(int i = 0; i < minutes ;i++){
            sum += grumpy[i] == 1?customers[i]:0;
        }
        
        maxsum = sum;
        for(int left = 0 , right = minutes; right < customers.length;right++){
            sum += grumpy[right] == 1?customers[right]:0;
            sum -= grumpy[left] == 1?customers[left]:0;
            maxsum = Math.max(sum , maxsum);
            left++;
        }
        return maxsum;
            
    }
}