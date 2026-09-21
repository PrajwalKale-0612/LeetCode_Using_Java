public class SellAndBuy 
{
    public static int maxProfit(int prices[])
    {
        int minPrice=prices[0];
        int maxProfit=0;

        int profit=0;

        for (int i = 0; i < prices.length; i++) 
        {
            if (minPrice>prices[i]) 
            {
                minPrice=prices[i];    
            }

            profit=prices[i]-minPrice;

            if (maxProfit<profit) 
            {
                maxProfit=profit;    
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) 
    {
        int arr[]={7,5,3,1,6,2};

        System.out.println(maxProfit(arr)+" is my Maximum Profit from these days.");
    }    
}
