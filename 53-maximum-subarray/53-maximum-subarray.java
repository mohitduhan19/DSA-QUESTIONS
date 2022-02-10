class Solution
{
    public int Max(int a, int b, int c)
    {
        if(a>=b)
        {
            if(a>=c)
                return a;
            else
                return c;
        }
        else
        {
            if(b>=c)
                return b;
            else
                return c;
            
        }
    }
    
    public int getMaxCrossingSubArray(int nums[], int l,int m,int h)
    {
        int lSum = Integer.MIN_VALUE;
        int sum=0;
        for(int i=m; i>=l; i--)
        {
            sum+=nums[i];
            if(sum>lSum)
                lSum=sum;
        }
        sum=0;
        int rSum = Integer.MIN_VALUE;
        for(int i=m+1; i<=h; i++)
        {
            sum+=nums[i];
            if(sum>rSum)
                rSum=sum;
        }
        
        return lSum+rSum;
    }
    public int getMaxSubArray(int[] nums, int l, int h)
    {
        if(l==h)
            return nums[l];
        
        int m = (l+h)/2;
            
        int LMax = getMaxSubArray(nums, l, m);
        int RMax = getMaxSubArray(nums, m+1, h);
        int CMax = getMaxCrossingSubArray(nums, l, m, h);
        
        return Max(LMax, RMax, CMax);
    }
    
    public int maxSubArray(int[] nums)
    {
        int n= nums.length;
        return getMaxSubArray(nums, 0, n-1);
    }
}