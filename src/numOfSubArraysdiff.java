import java.util.*;
import java.util.List;

public class numOfSubArraysdiff {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        //Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k and average greater than or equal to threshold.
        /*  Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
            Output: 3    */
        int sum = 0; 
      
        for(int i = 0; i<k; i++)
        {
            sum = sum + arr[i];
            
        }
        int count = 0;
        int divisorFisrt = sum / k;
        if(divisorFisrt >= threshold)
        {
            count = 1;
        }

        int tracker = 0;
        for(int i = k; i<arr.length; i++)
        {
            sum = sum + arr[i] - arr[i - k]; // add next element remove last one
            int divisor = sum / k;

            if(divisor >= threshold)
            {
               tracker++;
            }
        }

       

        if(count == 1)
        {
            return count + tracker;
        }
        else
        {
           return tracker; 
        }
        
    }
}
