public class Solution {
    public void sortColors(ArrayList<Integer> a) {
        int low=0;
        int mid=0;
        int high=a.size()-1;
        while(mid<=high)
        {
            if(a.get(mid)==0)
            {
                Collections.swap(a, low,mid);
                low++;
                mid++;
            }
            else if(a.get(mid)==1)
            {
               mid++; 
            }
            else if(a.get(mid)==2)
            {
                Collections.swap(a,mid,high);
                high--;
             
            }
        }
    }
}
    
