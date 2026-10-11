import java.util.*;

public class PascalTringle 
{
    public static void pascalTri()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the How Many Row and colmn :");
        int n=sc.nextInt();

        int arr[][]=new int[n][n];

        for (int i=0; i<n; i++) 
        {
            for (int j=0; j<=i; j++) 
            {
                if (j==0 || i==j ) 
                {
                    arr[i][j]=1;
                }
                else
                {
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }

        for (int i = 0; i <n; i++) 
        {
            for (int j = 0; j <n; j++) 
            {
                if (arr[i][j]!=0) 
                {
                    System.out.print(arr[i][j]+" ");
                }
                
            }
            System.out.println();
        }
    }



    public static void main(String[] args) 
    {
        pascalTri();
    }    
}
