import java.util.*;

public class ContainsDuplicate 
{
    public static boolean containTheDuplicateVal(int value[])
    {
        HashMap<Integer,Integer> duplicate=new HashMap<>();

        for (int val : value) 
        {
            if (duplicate.containsKey(val)&& duplicate.get(val)>=1) 
            {
                return true;
            }

            duplicate.put(val, duplicate.getOrDefault(val, 0)+1);
        }
        return false;
    }
    public static void main(String[] args) 
    {
        int arr[]={1,2,4,5,5,6,7,8};

        System.out.println(containTheDuplicateVal(arr));
    }    
}
