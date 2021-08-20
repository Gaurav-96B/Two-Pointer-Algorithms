class Solution
{
    long countTriplets(long arr[], int n,int sum)
    {
       Arrays.sort(arr);
       int count=0;
       for(int i=0;i<n-2;i++) 
       {
           int j=i+1;
           int k=n-1;
           while(j<k)
           {
               if(arr[i]+arr[j]+arr[k]<sum)
               {
                  count=count+(k-j);
                  j++;
               }
               else if(arr[i]+arr[j]+arr[k]>=sum)
               {
                   k--;
               }
               
               
           }
       }
       return count;
    }
}
