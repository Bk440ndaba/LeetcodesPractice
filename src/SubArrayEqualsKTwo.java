import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SubArrayEqualsKTwo {
    public static void main(String[] args) {
        SubArrayEqualsKTwo sk = new SubArrayEqualsKTwo();
        int [] array = {2, 2, 6};

      //  int result = sk.subarraySum(array, 0);
        //System.out.println(result);

        int container = sk.subarraySum(array, 0);
        System.out.println(container); 
    }
    public int subarraySum(int[] nums, int k)
    {
         /*   THIS IS FOR WHEN WE HAVE NUMS[i] <= 0;
           Input: nums = [1,1,1], k = 2

         Output: 2 */
        
         if(nums.length == 1 && k == 0)
             {
                 return 0;
             }
        
         if(nums.length == 1 && k == 1)
            {
                    return 1;
             }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length; i++)
        {
            list.add(nums[i]);
        }
        
        int smallest = Collections.min(list);

        
        int sum = 0;
        int countForLessThanZero = 0;
        int countForGreaterThanZero = 0;
        int remInd = 0;


       if(smallest < 0)
        {
            int firstNum = nums[0];
            if(firstNum < 0)
            {
                int numberToAdd = Math.abs(smallest) + 1; 

                for(int i = 0; i<nums.length; i++)
                {
                     nums[i] = nums[i] + numberToAdd;
                }
    
                for(int i = 0; i<nums.length; i++ )
                {
                    sum = sum + nums[i];
                    while(sum > k)
                    {
                        sum = sum - nums[remInd];
                        remInd++;
                    }
        
                    if(sum == k)
                    {
                       countForLessThanZero++;
                    }
    
                    return countForLessThanZero;
                }
                
            }
            else
            {
                int numberToAdd = Math.abs(smallest) + 1; 

                for(int i = 0; i<nums.length; i++)
                {
                 nums[i] = nums[i] + numberToAdd;
                }

                for(int i = 0; i<nums.length; i++ )
                {
                sum = sum + nums[i];
                while(sum > k)
                {
                    sum = sum - nums[remInd];
                    remInd++;
                }
    
                if(sum == k)
                {
                   countForLessThanZero++;
                }

               
                }
            return countForLessThanZero;
            }

        }
        else
        {
            for(int i = 0; i<nums.length; i++)
            {
                sum = sum + nums[i];
                while(sum > k)
                {
                    sum = sum - nums[remInd];
                    remInd++;
                }
    
                if(sum == k)
                {
                    countForGreaterThanZero++;
                }

                
            }

            
        }

        return countForGreaterThanZero;

        
        

        
    


    }
}
