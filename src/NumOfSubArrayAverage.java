import java.util.ArrayList;
import java.util.List;

public class NumOfSubArrayAverage {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        //Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k and average greater than or equal to threshold.
        /*  Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
            Output: 3    */
        int sum = 0; 
        List<List<Integer>> results = new ArrayList<>();
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

        
        for(int i = k; i<arr.length; i++)
        {
            sum = sum + arr[i] - arr[i - k]; // add next element remove last one
            int divisor = sum / k;

            if(divisor >= threshold)
            {
                List<Integer> subArray = new ArrayList<>();
               for(int j = i - k + 1; j<= i; j++)
               {
               
                // add them to subarray
                subArray.add(arr[j]);

               }

               results.add(new ArrayList<>(subArray));
            }
        }

        int sizeOfList = results.size();

        if(count == 1)
        {
            return sizeOfList + count;
        }
        else
        {
            return sizeOfList;
        }
        
    }
}
