// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution 
{
    public static boolean ispossible(int[] pages , int book,int mid , int total){
        int st = 1 , currpage = 0;
        for(int i = 0; i < pages.length;i++){
            if(currpage + pages[i] <= mid){
                currpage += pages[i];
            }else{
                st++;
                currpage = pages[i];
            }
        }
        if(st > total)return false;
        
        return true;
    }
    public static int max(int[] pages){
        int max = 0;
        for(int i = 0;i < pages.length;i++){
            max = Math.max(max , pages[i]);
        }
        return max;
    }
    public static int maxsum(int[] pages){
        int sum = 0;
        for(int i = 0;i < pages.length;i++){
            int k  = sum + pages[i];
            sum = Math.max(sum , k);
        }
        return sum;
    }
    //Function to find minimum number of pages.
    public static int findPages(int[]pages,int books,int students)
    {
        //Your code here
        int left = max(pages) , right = maxsum(pages);
        int ans = 0;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(ispossible(pages ,books , mid , students) == true){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
};