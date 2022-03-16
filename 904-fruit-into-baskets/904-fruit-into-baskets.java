class Solution {    
    public int totalFruit(int[] fruits) { 
         HashMap<Integer,Integer> map=new HashMap<>();
        int BasketCapacity=2 , Max = 0 , start = 0 , end = 0;
      
        while(end<fruits.length){
            map.put(fruits[end],map.getOrDefault(fruits[end],0)+1);
            
            if(map.size()<=BasketCapacity){
               Max=Math.max(Max,end - start + 1);
                
            }
    
            if(map.size()>BasketCapacity){
   
              while(map.get(fruits[start]) > 1){
              
                  map.put(fruits[start],map.get(fruits[start])-1);
                  start++;
              }
                map.remove(fruits[start]);
                start++;
                
        }   
            end++;
            
        }
        
        return Max;
        
    }
}