// //Q 26


// import java.lang.reflect.Array;
// import java.util.Arrays;

// public class RemoveDuplicateSortedArray 
// {
//     public  static  int removeDuplicate(int[] arr)
//     {
//         int fp=0;
//         for (int sp = 0; sp < arr.length; sp++) 
//         {
//             if (arr[fp]!=arr[sp]) 
//             {
//                 arr[++fp]=arr[sp];    
//             }    
//         }
//         return  ++fp;
//     }



//     public static void main(String[] args) 
//     {
//         int[] arr={1,2,3,3,4,4,5};

//         System.out.println(Arrays.toString(arr));
//         System.out.println(removeDuplicate(arr));
//         System.out.println(Arrays.toString(arr));
    
//         int size=removeDuplicate(arr);

//         for (int i = 0; i <size; i++) 
//         {
//             System.out.print(arr[i]+" ");    
//         }
//         System.out.println();


//     }    
// }


public class RemoveDuplicateSortedArray 
{
    public static int removeDuplicate(int arr[])
    {
        int i=0;

        for (int j = 1; j <arr.length; j++) 
        {
            if(arr[i]<arr[j])
            {
                int temp=arr[++i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        return i+1;
    }
    public static void main(String[] args) 
    {
        int arr[]={1,2,2,3,3,3,4,5,6,7,7};

        System.out.println(removeDuplicate(arr));
    }
}