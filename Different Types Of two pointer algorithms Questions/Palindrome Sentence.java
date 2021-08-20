class Solution { 

    static boolean sentencePalindrome(String s) { 
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(!(s.charAt(i)>='a'&&s.charAt(i)<='z'))
            {
                i++;
            }
            else if(!(s.charAt(j)>='a'&&s.charAt(j)<='z'))
            {
                j--;
            }
            else if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
