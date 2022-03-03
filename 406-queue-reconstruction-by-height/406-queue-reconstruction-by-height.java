class Solution {
    public class peoplecomparator implements Comparator<int[]>{
        public int compare(int[] a , int[] b){
            if(a[0] == b[0])return a[1] - b[1];
            return b[0] - a[0];
        }
    }
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people , new peoplecomparator());
        List<int[]> list = new ArrayList<>();
        
        for(int[] p : people){
            list.add(p[1] , p);
        }
        
        return list.toArray(new int[people.length][2]);
    }
}