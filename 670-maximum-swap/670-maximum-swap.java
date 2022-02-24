
//     public void swap(char[] arr , int i , int j){
//         char temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
//     public int maximumSwap(int num) {
//         char[] arr = String.valueOf(num).toCharArray();
        
//         int[] lastidx = new int[10];
//         for(int i = 0; i< arr.length;i++){
//             lastidx[arr[i] - '0'] = i;
//         }
        
//        boolean flag = false;
//         for(int i = 0;i < arr.length;i++){
//             int digit = arr[i] - '0';
//             for(int j = 9;j>0;j--){
//                 if(lastidx[j] > i){
//                     swap(arr , i , lastidx[j]); 
//                     flag = true;
//                     break;
//                 }
//             }
//             if(flag == true){
//                 break;
//             }
//         }
//         String res = "";
//         for(int i = 0; i< arr.length;i++){
//            res += arr[i];
//         }
//         return Integer.parseInt(res);
    
    class Solution {
    public int maximumSwap(int num) {
        int largest = 0;
        int index = 0;
        
        char arr[] = String.valueOf(num).toCharArray();
        
        int resArray[] = new int[arr.length];
        
        for(int i = 0; i<arr.length; i++){
            resArray[i] = arr[i] - '0';
        }
        
        for(int i = 0; i< resArray.length - 1 ; i++){
            for(int j = i+1 ; j<resArray.length; j++){
                if(resArray[j] > resArray[i] && resArray[j] >= largest){
                    largest = resArray[j];
                    index = j;
                }
            }
            if(largest > 0){
                resArray[index] = resArray[i];
                resArray[i] = largest;
                break;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int val: resArray){
            sb = sb.append(val);
        }
        return Integer.parseInt(sb.toString());        
    }
}
    
