class Solution{
public boolean isValidSubsequence(String a, String b) {
       
        if (a.length() > b.length()) return false;
        
        
        int i=0,j=0;
        while (i<a.length() && j<b.length()) {
            if (a.charAt(i)==b.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == a.length();
    }

    public int findLUSlength(String[] strs) {
        int ans = -1;
        for (int i=0;i<strs.length;i++) {
            boolean isUncommon = true;
            for (int j=0;j<strs.length;j++) {
                if (i!=j && isValidSubsequence(strs[i], strs[j])) {
                    isUncommon = false;
                    break;
                }
            }
            if (isUncommon) {
                ans = Math.max(ans, strs[i].length());
            }
        }
        return ans;
    }
}