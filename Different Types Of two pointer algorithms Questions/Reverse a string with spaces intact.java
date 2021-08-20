
    String reverseWithSpacesIntact(String S)
    {
        char c[]=S.toCharArray();
        int i=0;
        int j=S.length()-1;
        while(i<j)
        {
            if(c[i]==' ')
            {
                i++;
            }
            else if(c[j]==' ')
            {
                j--;
            }
            else
            {
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
            }
        }
        return String.valueOf(c);
    }
