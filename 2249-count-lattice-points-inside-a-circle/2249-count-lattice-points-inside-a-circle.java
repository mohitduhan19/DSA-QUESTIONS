class Solution {
    public int countLatticePoints(int[][] circles) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<circles.length;i++){
            int r = circles[i][2];
            int x = circles[i][0];
            int y = circles[i][1];
            for(int h=x-r; h<=x+r; h++){
                for(int k=y-r; k<=y+r; k++){
                    if((h-x)*(h-x) + (k-y)*(k-y) <= r*r){
                        set.add(1000*h + k);
                    }
                }
            }
        }
        return set.size();
    }
}