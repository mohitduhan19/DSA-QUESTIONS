class Solution {
    public int maximumUnits(int[][] boxType, int truckSize) {
       Arrays.sort(boxType, (a,b)-> b[1] - a[1]);
        
        int maxUnit = 0;
        
        for(int[]box : boxType){
            int noOfBox = box[0], noOfUnit = box[1];
            
            if(truckSize >= noOfBox){
                maxUnit += noOfBox*noOfUnit;
                truckSize -= noOfBox;
            }else{
                maxUnit += truckSize*noOfUnit;
                return maxUnit;
            }
        }
        return maxUnit;
     }
}






























































































































































