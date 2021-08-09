
/*TC=>O(N^3)
SC=>O(1)*/
class Solution
{
    public static boolean find3Numbers(int A[], int n, int X) { 
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(A[i]+A[j]+A[k]==X)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

/*TC=>O(N^2)
SC->O(1)*/

class Solution
{
    public static boolean find3Numbers(int A[], int n, int X) { 
        Arrays.sort(A);
        for(int i=0;i<n-2;i++)
        {
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                if(A[i]+A[j]+A[k]==X)
                {
                    return true;
                }
                else if(A[i]+A[j]+A[k]>X)
                {
                    k--;
                }
                else
                {
                  j++;  
                }
            }
        }
        return false;
    }
}









