public class PallindromicSubstring 
{
    public static String subString(String s)
    {
        int start=0;
        int end=1;

        int l=0;
        int r=0;

        for (int i = 0; i <s.length(); i++) 
        {
            //even
            l=i;
            r=i+1;
            
            while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)) 
            {
                if (r-l+1>end) 
                {
                    start=l;
                    end=r-l+1;    
                }    
                l--;
                r++;
            }

            //odd 
            l=i-1;
            r=i+1;

            while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)) 
            {
                if (r-l+1>end) 
                {
                    start=l;
                    end=r-l+1;    
                }    
                l--;
                r++;
            }
        }


        return s.substring(start, start+end);


    }
    public static void main(String[] args) 
    {
        String s=subString("babad");

        System.out.println("Longest Substring of given string  : "+s);
    }    
}
