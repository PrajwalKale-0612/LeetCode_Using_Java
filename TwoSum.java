//Q1) Time complexity 0(n^2);

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * TwoSum
 */
public class TwoSum {

    public  static  int[] twoSum(int num[],int target)
    {
        for (int i = 0; i < num.length; i++) 
        {
            for (int j = i+1; j < num.length; j++) 
            {
                if (num[i]+num[j]==target) 
                {
                    return new int[] {i,j};    
                }    
            }    
        }

        return  new int[] {};
    }
    public static void main(String[] args) 
    {
        int [] num={3,4,6,8,9};
        
        System.out.println(Arrays.toString(twoSum(num, 14)));
    }
}