class Solution {
    public void back(String digits , int i , HashMap<Character , String>map , StringBuilder sb , List<String> ans){
        if(i == digits.length()){
            ans.add(sb.toString());
            return;
        }
        
        String s = map.get(digits.charAt(i));
        for(int k = 0; k < s.length();k++){
            sb.append(s.charAt(k));
            back(digits , i + 1 , map , sb , ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0)return ans;
        HashMap<Character , String> map = new HashMap<>();
        
        map.put('2' , "abc");
        map.put('3' , "def");
        map.put('4' , "ghi");
        map.put('5' , "jkl");
        map.put('6' , "mno");
        map.put('7' , "pqrs");
        map.put('8' , "tuv");
        map.put('9' , "wxyz");
        
        back(digits , 0 , map, new StringBuilder() , ans);
        return ans;
    }
}