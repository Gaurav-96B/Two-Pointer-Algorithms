class Complete{
    public static int chocolates (int a[], int n) {
        int i=0;
        int j=n-1;
        while(i<j)
        {
            if(a[i]>a[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return a[i];
        
    }
    
    
}


