public class MergeSortedArray 
{
    public static void mergeSortArr(int arr1[],int n,int arr2[],int m)
    {
        int i=n-1;
        int j=m-1;
        int k=(n+m)-1;

        while (i>=0 && j>=0) 
        {
            if (arr1[i]>arr2[j]) 
            {
                arr1[k--]=arr1[i--];
                
            }
            else
            {
                arr1[k--]=arr2[j--];
            }
        }

        while (j>=0) 
        {
            arr1[k--]=arr2[j--];
        }

        for (int val : arr1) 
        {
            
            System.out.print(val+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) 
    {
        int arr1[]={1,2,3,6,0,0,0,0,0};
        int arr2[]={2,3,4,5,5};
        mergeSortArr(arr1,4 ,arr2,5);
    }    
}
