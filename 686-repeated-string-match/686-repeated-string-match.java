class Solution {
    public int repeatedStringMatch(String a, String b) 
    {
        String str=a;//storing string a so that we can concatenate it later
        int noOfRepeats = b.length()/a.length() +2;
        int count=1;//count is 1 coz if b is already present in a then 1 time is repeated
        for(int i=1;i<=noOfRepeats;i++)
        {
            if(a.contains(b)) //if("abcabc".contains("abc"))
                return count;
            else
            {
                a=a+str;//Concating string to repeat string a, abc -> abcabc
                count++;
            }
        }
        return -1;//if b could not become a substring of a after repeating a
    }
}