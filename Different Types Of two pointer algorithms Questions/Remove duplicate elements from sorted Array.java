class Solution {
    int remove_duplicate(int A[],int N){
        int j=0;
        for(int i=0;i<N-1;i++)
        {
          if(A[i]!=A[i+1]) 
          {
              A[j++]=A[i];
          }
        }
        A[j++]=A[N-1];
        return j;
    }
}
