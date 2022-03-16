class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0 , cost = 0 , ans = 0;
        for(int right = 0; right < s.length();right++){
            char chs = s.charAt(right);
            char cht = t.charAt(right);
            
            cost += Math.abs(chs - cht);
            
            if(cost > maxCost){
                cost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }
            
            ans = Math.max(ans , right - left + 1);
        }
        return ans;
    }
}