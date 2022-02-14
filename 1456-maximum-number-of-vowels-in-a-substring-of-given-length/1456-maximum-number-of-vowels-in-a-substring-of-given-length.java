class Solution {
    public boolean isvowel(char c){
        return (c == 'a') || (c == 'e') ||  (c == 'i') || (c == 'o') || (c == 'u');
    }
    public int maxVowels(String s, int k) {
      int vowel = 0 , maxlen = 0;
        for(int i = 0; i< k ;i ++){
            if(isvowel(s.charAt(i)))vowel++;
        }
        for(int i = k; i< s.length();i++){
            if(vowel > maxlen)maxlen = vowel;
            if(isvowel(s.charAt(i)))vowel++;
            if(isvowel(s.charAt(i - k)))vowel--;
        }
        if(vowel > maxlen)maxlen = vowel;
        return maxlen;
    }
}