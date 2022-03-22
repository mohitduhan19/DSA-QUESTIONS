class Solution {
    public String getSmallestString(int n, int k) {
        char[] arr = new char[n];
        for(int i = 0; i < arr.length;i++){
            arr[i] = 'a';
        } 
        k = k - n;
        for(int j = arr.length - 1; j >= 0;j--){
            if(k < 25){
                arr[j] = (char)('a' + k);
                k = 0;
            }else{
                arr[j] = 'z';
                k = k - 25;
            }
        }
        return new String(arr);
    }
}