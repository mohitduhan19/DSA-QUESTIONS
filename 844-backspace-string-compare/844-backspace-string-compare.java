class Solution {
    public boolean backspaceCompare(String str1, String str2) {
        if(str1.length() == 0 || str2.length() == 0) {
            return false;
        }
        
        String modStr1 = checkStrings(str1);
        String modStr2 = checkStrings(str2);
        
        if(modStr1.equals(modStr2)) {
            return true;
        }
        
        return false;
    }
    
    private String checkStrings(String str) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if(ch == '#' && index > 0) {
                sb.deleteCharAt(index - 1);
                index--;
            }
            else if(ch == '#' && index == 0){
                continue;
            }
            else{
                sb.append(ch);
                index++;
            }
        }
        
        return sb.toString();
    }
}