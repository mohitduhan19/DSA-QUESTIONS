// class Solution {
//     public void solveConfiguration(char[] arr , int i , int j){
//         if(arr[i] == 'L' && arr[j] == 'L'){
//             //make all dots left
//             for(int k = i + 1;k < j;k++){
//                 arr[k] = 'L';
//             }
//         }else if(arr[i] == 'R' && arr[j] == 'R'){
//             //make all dots right
//             for(int k = i + 1;k < j;k++){
//                 arr[k] = 'R';
//             }
//         }else if(arr[i] == 'L' && arr[j] == 'R'){
//             //do nothing
     
//         }else{
//             //even and odd
//             int diff = j - i;
//             int mid = (i + j)/2;
            
//             if(diff %2 == 0){
//                 //odd
//                 for(int k = i + 1; k < mid;k++){
//                     arr[k] = 'R';
//                 }
//                 for(int k = mid + 1; k < j;k++){
//                     arr[k] = 'L';
//                 }
//             }else{
//                 //even
//                 for(int k = i + 1; k <= mid;k++){
//                     arr[k] = 'R';
//                 }
//                 for(int k = mid + 1; k < j;k++){
//                     arr[k] = 'L';
//                 }
//             }
//         }
//     }
//     public String pushDominoes(String dominoes) {
//         int n = dominoes.length();
//         char[] nums = new char[n + 2];
//         nums[0] = 'L';
//         nums[n  - 1] = 'R';
//         //filling of char array
//         for(int i = 1; i < nums.length - 1; i++){
//             nums[i] += dominoes.charAt(i - 1);
//         }
        
//         int j = 0 , k = 1;
//         while(k < nums.length){
//             while(nums[k] == '.'){
//                 k++;

//             }
//              if(k-j >1){
//             solveConfiguration(nums , j ,k);
//              }
//             j = k;
//             k++;
//         }
//         StringBuilder sb = new StringBuilder();
//         for(int x = 1; x < nums.length - 1;x++){
//             sb.append(nums[x]);
//         }
//         return sb.toString();
//     }
// }

class Solution {
    public String pushDominoes(String d) {
        int n = d.length();
        char[] arr = new char[n+2];//+2 as we will placed a dummy domino L on left and R on right
        arr[0] = 'L';
        arr[arr.length-1] = 'R';
        
        for(int i = 1; i < arr.length-1 ; i++){
            arr[i] = d.charAt(i-1);//as we put 1 and last so we start from 1 but char is at 0 so i-1    
        }
        
        int i = 0 , j = 1;//using two pointers we will find the posn for the pairs of dominoes
        while(j < arr.length){
            while(arr[j] == '.') 
                j++;//till we found a L Or R move j ahead
            if(j - i > 1){
                solve(arr, i , j);//after finding it pass the index of it and its pair means i
            }
            i = j;//i will become j as its L|R
            j++;//and j againg will go in search for its pair
        }
        StringBuilder sb = new StringBuilder();
		//As first one was dummy just to make pairing and same for the last one so skip them in main ans
        for(int k = 1;k < arr.length-1; k++){
            sb.append(arr[k]);
        }
        return sb.toString();
    }
    
    
    
    private void solve(char[] arr , int i , int j){
        //#1 when there is L ... L then all in between will be L only \\\\\
        if(arr[i] == 'L' && arr[j] == 'L'){
            for(int k = i + 1; k < j; k++){//from i+1 till just before j
                arr[k] = 'L';
            }
        }
        
        //#2 when there is R ... R then all in between will be R only /////
        else if(arr[i] == 'R' && arr[j] == 'R'){
            for(int k = i + 1; k < j; k++){//from i+1 till just before j
                arr[k] = 'R';
            }
        }
        
        //#3 when there is L....R then both will not affect in bet as \...../
        else if(arr[i] == 'L' && arr[j] == 'R'){
            //do nothing and chill
        }
        
        //#4 when there is R....L then two more cases as
        else if(arr[i] == 'R' && arr[j] == 'L'){
            int diff = j - i;//the space in between those two
            int mid = (i + j) / 2;
            if(diff % 2 == 0){//if diff is even then R ... L r at 2and l at 6 then 6-2=4 so RR.LL //|\\
                for(int k = i+1; k < j; k++){
                    if(k < mid){
                        arr[k] = 'R';
                    }else if(k == mid){
                        //do nothing
                    }else if(k > mid){
                        arr[k] = 'L';
                    }
                }
            }
            else if(diff % 2 != 0){//if diff is odd then R .... L r at 2and l at 7 then 7-2=5 so RRRLLL ///\\\
                for(int k = i+1; k < j; k++){
                    if(k <= mid){
                        arr[k] = 'R';
                    }else if(k > mid){
                        arr[k] = 'L';
                    }
                }
            }
        }
    }
}