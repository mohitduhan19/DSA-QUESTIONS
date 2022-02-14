class Solution {
    public int balancedString(String s) {
       
        HashMap<Character,Integer> map = new HashMap<>();
        int target = s.length()/4;
        int minlen = s.length();
                
        //save the occurence of characters in map
        for(char c:s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        
        //if the string is already balanced return 0
        if(isBalanced(map,target)) return 0;
        
        int left=0;
        for (int right = 0; right < s.length(); right++)
        {
            map.put(s.charAt(right), map.get(s.charAt(right)) - 1); 
            if (isBalanced(map, target))
            {
                minlen = Math.min(minlen, right - left + 1);
                while(left<= right)
                {
                    map.put(s.charAt(left), map.get(s.charAt(left)) + 1);  
                    left++;
                    if (isBalanced(map, target))
                    { 
                        minlen = Math.min(minlen, right - left + 1);
                    }
                    else
                    break;
                       
                }
            }
        }
       return minlen;
     }
    
    private boolean isBalanced(HashMap<Character,Integer> map,int target)
    {
        for (Map.Entry<Character,Integer> entry : map.entrySet())  
        {
            if(entry.getValue()>target)
                return false;
        } 
        return true;
    }
}