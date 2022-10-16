//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int nums[], int n)
    {
          if(nums.length == 0)return 0;
        int sum = 0 , maxlen = 0;
     HashMap<Integer , Integer> map = new HashMap<>();
     map.put(0 , -1);
     for(int i = 0; i< nums.length;i++){
         sum += nums[i];
         if(map.containsKey(sum)){
             int idx = map.get(sum);
             int len = i - idx;
             if(len > maxlen)maxlen = len;
         }else{
             map.put(sum ,i);
         }
     }
     return maxlen;
    }
}