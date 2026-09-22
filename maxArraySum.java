public class maxArraySum 
{
    public static int maxSum(int nums[])
    {
        int currSum=nums[0];
        int maxSum=nums[0];

        for (int i = 1; i < nums.length; i++) 
        {
            currSum=Math.max(currSum+nums[i],nums[i]);
            maxSum=Math.max(maxSum,currSum);
        }

        return maxSum;


    }
    public static void main(String[] args) 
    {
        int arr[]={1,2,-4,6,-8,9,-2,1,-7,8};

        System.out.println("This is max sum of Array : "+maxSum(arr));
    }    
}
