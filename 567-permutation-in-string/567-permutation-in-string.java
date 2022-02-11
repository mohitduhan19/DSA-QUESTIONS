class Solution {
    public boolean isequal(int[] a , int[] b){
        for(int i = 0;i < 26;i++){
            if(a[i] != b[i])return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int[] reqfreq = new int[26];
        int window = s1.length();
        for(int i = 0;i<window;i++){
            reqfreq[s1.charAt(i) - 'a']++;
        }
            int[] currfreq = new int[26];
            for(int i = 0; i< s2.length();i++){
                currfreq[s2.charAt(i) -'a']++;
                  if(i >= window){
                       currfreq[s2.charAt(i - window) - 'a']--;
            }
                if(isequal(reqfreq , currfreq) == true){
                    return true;
                }
          
        }
        return false;
        
    }
}