class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<Integer>();
        int[] req = new int[26];
        for(int i=0;i<p.length();i++){
            req[p.charAt(i)-'a']++;
        }
        for(int i=0;i<=s.length()-p.length();i++){
            String temp = s.substring(i,p.length()+i);
            int[] curr = new int[26];
            for(int j=0;j<p.length();j++){
                curr[temp.charAt(j)-'a']++;
            }
            if(Arrays.equals(req,curr))
                list.add(i);
        }
        return list;
    }
}