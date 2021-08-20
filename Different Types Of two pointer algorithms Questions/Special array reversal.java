class Solution
{
    public String reverse(String s)
    {
        char str[]=s.toCharArray();
        int l=0;
        int r = str.length - 1;
        while (l < r) 
        { 
            if (!Character.isAlphabetic(str[l])) 
                l++; 
            else if(!Character.isAlphabetic(str[r])) 
                r--; 
            else 
            { 
                char tmp = str[l]; 
                str[l] = str[r]; 
                str[r] = tmp; 
                l++; 
                r--; 
            } 
        }
        return String.valueOf(str);
    }
}
