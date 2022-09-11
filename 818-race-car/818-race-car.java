class Car{
    int position;
    int speed;
    public Car(int position, int speed){
        this.position = position;
        this.speed = speed;
    }
}
class Solution {

    public int racecar(int target) {
        if(target == 0)
            return 0;
        
        return bfs(target, new Car(0,1));
    }
    
    private int bfs(int target, Car c){
        
        int res = 0;
        Queue<Car> queue = new LinkedList<>();
        queue.offer(c);
        
        Set<String> visited = new HashSet<>();
        String key = c.position + "," + c.speed;
        visited.add(key);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i< size;i++){
                
                Car c1 = queue.poll();
                int currPos = c1.position;
                int currSpeed = c1.speed;
                
                if(currPos == target)
                    return res;
               
                // A
                int Apos = currPos + currSpeed;
                int ASpeed = currSpeed * 2;
                String AKey = Apos + "," + ASpeed;
                
                if(!visited.contains(AKey) && Math.abs(target - Apos) < target){
                    visited.add(AKey);
                    Car A = new Car(Apos, ASpeed);
                    queue.offer(A);
                }
                
                // R
                int Rpos = currPos;
                int RSpeed = currSpeed > 0 ? -1 : 1;
                String RKey = Rpos + "," + RSpeed;
                
                if(!visited.contains(RKey) && Math.abs(target - Rpos) < target){
                    visited.add(RKey);
                    Car R = new Car(Rpos, RSpeed);
                    queue.offer(R);
                }  
            }
            res++;
        }
        
       return -1;
    }
}