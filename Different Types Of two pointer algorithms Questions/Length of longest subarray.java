class Compute {
    
    public long longestSubarry(long A[], int N)
    {
        long max=0;
        for(int i=0;i<N;i++)
        {
            long count=0;
            while(i<N&&A[i]>=0)
            {
                count++;
                i++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
