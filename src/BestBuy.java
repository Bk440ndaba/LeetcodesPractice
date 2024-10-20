import java.util.ArrayList;
import java.util.Collections;

public class BestBuy {

    public int maxProfitBruteForce(int[] prices) {
        // The brute force approach

        /*   Input: prices = [7,1,5,3,6,4]
            Output: 5 
            ArrayList<Integer> list =  new ArrayList<>();
            int result = 0;
            if(prices.length == 1)
            {
                return 0;
            }

            for(int i = 0; i<prices.length; i++)
            {
                for(int j = i + 1; j<prices.length; j++)
                {
                    result = prices[j] - prices[i];
                    list.add(result);
                }
            }

            int maxProfit = Collections.max(list);
            if(maxProfit == -1)
            {
                return 0;
            }
            else{
                return maxProfit;
            }
            */

            //return maxProfit;
    }

    public int maxProfit(int[] prices)
    {
        //The slinding window technique

        int profit = 0;
        int minValue = Integer.MAX_VALUE; // 

        for(int i = 0; i<prices.length; i++)
        {
            if(prices[i] < minValue)
            {
                minValue = prices[i];
            }

            if(prices[i] - minValue > profit)
            {
                profit = prices[i] - minValue;
            }
        }

        return profit;
    }


}
