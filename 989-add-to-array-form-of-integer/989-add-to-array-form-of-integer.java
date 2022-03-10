class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        List<Integer>list = new ArrayList<>();
        int len = nums.length - 1;
        
        while(len >= 0 || k > 0){
            if(len >= 0){
                k += nums[len];
                len--;
            }
            list.add(0 ,k%10);
            k /=10;
        }
                  return (list);
    }
}


//   while(len >= 0 || k != 0){
        
//         if(len >= 0){
//             k += num[len];
// 			len--;
//         }
        
//         result.addFirst(k % 10);
//         k /= 10;
//     }
        
//     return result;
    
// }