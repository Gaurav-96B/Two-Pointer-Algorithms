class Compute
{
    boolean find4Numbers(int a[], int n, int X) 
    {
        Arrays.sort(a);
        int sum=0;
        for(int i=0;i<n-3;i++)
        {
            for(int j=i+1;j<n-2;j++)
            {
               int k=j+1;
	           int m=n-1;
	            while(k<m)
	            {
	                sum=a[i]+a[j]+a[k]+a[m];
	                if(sum==X)
	                {
	                    return true;
	                }
	                else if(sum>X)
	                {
	                    m--;
	                }
	                else 
	                {
	                    k++;
	                }
	            }
	                  
            }
        }
        return false;
        
    }
}
