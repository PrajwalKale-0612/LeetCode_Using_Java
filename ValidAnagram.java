import java.util.*;

/**
 * 242 ValidAnagram
 */


public class ValidAnagram 
{
    public static boolean isAnagram(String s,String t)
    {
        if (s.length()!=t.length()) 
        {
            return false;    
        }

        HashMap<Character,Integer> frequency=new HashMap<>();

        for(char ch : s.toCharArray()) 
        {
            frequency.put(ch, frequency.getOrDefault(ch, 0)+1);
        }

        for (char ch : t.toCharArray()) 
        {
            if (!frequency.containsKey(ch)) 
            {
                return false;    
            }
            frequency.put(ch,frequency.get(ch)-1); 
            
            if (frequency.get(ch)<0) 
            {
                return false;    
            }
        }

        return  true;

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the First String : ");
        String s=sc.nextLine();

        System.out.println("Enter the Second String : ");
        String t=sc.nextLine();


        System.out.println("String Anagram Result is : "+isAnagram(s,t));
    }
    
}