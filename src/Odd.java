import java.util.ArrayList;

public class Odd {
    public int countOdds(int low, int high) {
        
            /*  Input: low = 3, high = 7
                Output: 3
                Explanation: The odd numbers between 3 and 7 are [3,5,7]. 
                int count = 0;

                for(int i = low; i<high + 1; i++)
                {
                    if(i % 2 != 0)
                    {
                        count++;
                    }
                }
                return count;

            This was my initial approach

            */

            /* We have the formula : (High - Low) / 2 + 1
             * all we need is to find the nearest odd numbers, meaning the range, Both high and low have to be even 
             * They both have to be the nearest odd numbers in the given range, inclusive
             */

             if(low % 2 == 0) // if low is even, get the nearest odd number
             {
                low++;
             }

             if(high % 2 == 0) // if high is even, get the nearest odd number, lesser than the current high
             {
                high--;
             }

             int count = (high - low) / 2 + 1;
             return count;
    }
}
