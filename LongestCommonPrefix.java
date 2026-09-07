//Q14) ;


public class longestCommonPrefix 
{
    public static String longestComPrefix(String []strs)
    {
        String prefix=strs[0];

        for(int i=1;i<strs.length;i++)
        {
            while(!strs[i].startsWith(prefix))
            {
                prefix=prefix.substring(0,prefix.length()-1);

                if(prefix=="")
                {
                    return prefix;
                }
            }
        }

        return prefix;
    }
    public static void main(String[] args) 
    {
        String[]=strs["flower","flow","flight"];

        longestComPrefix(strs);
    }   
}
