class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int ans=arr[n-1]-arr[0];
        int smallest=arr[0]+k;
        int largest=arr[n-1]-k;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++)
        {
            min=Math.min(smallest,arr[i+1]-k);
            max=Math.max(largest,arr[i]+k);
            ans=Math.min(ans,max-min);
        }
        return ans;
        
    }
}
