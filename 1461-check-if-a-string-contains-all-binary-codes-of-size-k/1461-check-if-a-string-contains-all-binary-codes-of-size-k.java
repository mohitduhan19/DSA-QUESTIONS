class Solution {
   public boolean hasAllCodes(String s, int k) {
    if(s.length() < k - 1 + (1 << k)) {
        return false;
    }
    boolean[] exists = new boolean[1 << k];
    int rem = 1 << k, mask = rem - 1, n = 0;
    char[] c = s.toCharArray();
    for(int i = 0; i < k - 1; i++) {
        n = n << 1 | (c[i] - '0');
    }
    for(int i = k - 1; i < c.length; i++) {
        n = (n << 1 | (c[i] - '0')) & mask;
        if(!exists[n]) {
            exists[n] = true;
            if(--rem == 0) return true;
        }
    }
    return false;
}
}