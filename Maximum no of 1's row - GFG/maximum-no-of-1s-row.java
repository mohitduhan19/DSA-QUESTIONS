// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [][]arr = new int[n][m];
            
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < m; ++j)
                    arr[i][j] = sc.nextInt ();

    		System.out.println (new Sol().maxOnes (arr, n, m));
        }
        
    }
}// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int transition(int[] arr , int m){
        int left = 0 , right = arr.length - 1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == 0){
                left = mid + 1;
            }else{
                ans = mid;
                right = mid - 1;
            }
        }
        return ans;
    }
    public static int maxOnes (int nums[][], int n, int m)
    {
        // your code here
        int left = 0 , right = nums.length - 1;
        int ans = -1 , ones = 0;
        
        for(int i = 0; i < nums.length;i++){
            int tp = transition(nums[i] , m);
            if(tp != -1 && m - tp > ones){
                ans = i;
                ones = m - tp;
                right = tp - 1;
            }
            
        }
        return ans;
    }
}