class Solution {
     public void reverse(char[] num, int l) {
       int h=num.length-1;
        while(l<h) {
            swap(num,l++,h--);
        }
    }
     public void swap(char[] num,int i,int j){
        num[i] ^= num[j];
		num[j] ^= num[i];
		num[i] ^= num[j];
    }
    public int nextGreaterElement(int n) {
       char[] arr = String.valueOf(n).toCharArray();
        int i = arr.length - 2;
        while(i >= 0 && arr[i] >= arr[i + 1]){
            i--;
        }
        
        if(i == -1)
            return -1;
        
        int k = arr.length - 1;
        while(arr[k] <= arr[i]){
            k--;
        }
        
       swap(arr , i ,k);
        reverse(arr , i+1);
        
        long val = Long.parseLong(String.valueOf(arr));
        return val > Integer.MAX_VALUE?-1:(int)val;
    }
}