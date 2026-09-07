import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchInsertPosition 
{
    public  static int searchInsertPos(int[] arr,int target)
    {
        int si=0;
        int ei=arr.length-1;

        while (si<=ei) 
        {
            int mid=(si+ei)/2;
            
            if (arr[mid]==target) 
            {
                return target;    
            }
            else if (arr[mid]<target) 
            {
                si=mid+1;    
            }
            else
            {
                ei=mid-1;
            }
        }
        return si;
    }
    public static void main(String[] args) 
    {

        int[] arr={1,2,3,5,6,7,8};

        System.out.println(Arrays.toString(arr));
        System.out.println(searchInsertPos(arr, 4));
    }    
}
