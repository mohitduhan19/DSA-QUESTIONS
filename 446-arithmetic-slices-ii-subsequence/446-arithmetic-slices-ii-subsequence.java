class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        HashMap<Integer , Integer>[] map = new HashMap[nums.length];
        for(int i = 0; i < nums.length;i++){
            map[i] = new HashMap<>();
        }
        int ans = 0;
        for(int i = 1; i < map.length;i++){
            for(int j = 0; j < i;j++){
                long cd = (long)nums[i] - (long)nums[j];
                if(cd <= Integer.MIN_VALUE || cd >= Integer.MAX_VALUE)continue;
                int apsEndingOnJ = map[j].getOrDefault((int)cd , 0);
                int apsEndingOnI = map[i].getOrDefault((int)cd , 0);
                
                ans += apsEndingOnJ;
                map[i].put((int)cd , apsEndingOnJ + apsEndingOnI + 1);
            }
        }
        return ans;
    }
}