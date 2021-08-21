public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int i=0;
        int j=1;
        while(i<A.size()&&j<A.size())
        {
            if(A.get(j)-A.get(i)==B&&i!=j)
            {
                return 1;
            }
            else if(A.get(j)-A.get(i)<B)
            {
                j++;
            }
            else
            {
                i++;
            }
        }
        return 0;
    }
}
