class Solution {
    class car{
        int posit;
        double time;
        car(int posit , double time){
            this.posit = posit;
            this.time = time;
        }
    }
    
    public class Mycomporator implements Comparator<car>{
        public int compare(car obj1 , car obj2){
            return obj1.posit - obj2.posit;
        }
    }
    public int carFleet(int target, int[] position, int[] speed) {
        car[] c = new car[speed.length];
        for(int i = 0; i < speed.length;i++){
            c[i] = new car(position[i] , ((target - position[i])*1.0)/speed[i]);
        }
        Arrays.sort(c , new Mycomporator());
        int ans = 0;
            for(int i = speed.length-1; i >=1;i--){
                if(c[i].time >= c[i-1].time){
                       c[i-1] = c[i];                    
                }else ans++;
            }
        return ans+1;
    }
}