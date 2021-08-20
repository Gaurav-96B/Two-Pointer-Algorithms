class Sol
{
    public static int closestToZero (int arr[], int n)
    {
	        Arrays.sort(arr);
            int left=0;
            int right=n-1;
            int minSum=Integer.MAX_VALUE;
            while(left<right)
            {
            int sum=arr[left]+arr[right];
            if(Math.abs(minSum)>Math.abs(sum))
            {
            minSum=sum;
            }
            else if(sum<=0)
            {
            left++;
            }
            else if(sum>0)
            {
            right--;
            }
            }
        return minSum;
    }
}
