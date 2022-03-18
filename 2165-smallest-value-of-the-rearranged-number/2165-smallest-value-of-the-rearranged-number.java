class Solution {
    public long smallestNumber(long num) {
        if(num == 0L){return 0L;}
        char[] arr = Long.toString(num).toCharArray();
        if(num > 0){
            Arrays.sort(arr);
            int i = 0;
            while(arr[i] == '0'){
                i ++;
            }
            char temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            StringBuilder sb = new StringBuilder();
            for(char c : arr){
                sb.append(c);
            }
            return Long.parseLong(sb.toString());
        }else{
            Character[] arr2 = new Character[arr.length-1];
            for (int i = 0; i < arr.length-1; i++) {
                arr2[i] = arr[i+1];
            //System.out.print(arr2[i]);
             }
           
           Arrays.sort(arr2);
            StringBuilder sb = new StringBuilder();
            for(int i = arr2.length - 1; i >= 0;i--){
                sb.append(arr2[i]);
            }
            return Long.parseLong(sb.toString()) * -1L;
        }
        
        
    }
}