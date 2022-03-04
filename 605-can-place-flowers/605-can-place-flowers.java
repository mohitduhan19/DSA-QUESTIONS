class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int[] res = new int[flowerbed.length + 2];
        for(int i = 0;i < flowerbed.length;i++){
            res[i + 1] = flowerbed[i];
        }
        
        int count = 0;
        for(int i = 1; i <= flowerbed.length;i++){
            if(res[i] == 0 && res[i - 1] == 0 && res[i + 1] == 0){
                count++;
                res[i] = 1;
            }
            
        }
        return (count >= n)?true:false;
    } 
}