import java.util.Arrays;
import java.util.HashSet;

public class LongestConseSeq {
    public int longestConsecutive(int[] nums) {
        /*  Input: nums = [100,4,200,1,3,2]
            Output: 4   */

        /*  Input: nums = [100,4,200,1,3,2]
            Output: 4   */

            Arrays.sort(nums);
    
            if(nums.length == 0)
            {
                return 0;
            }
    
    
           
            int count = 1;
            int max = 0;
            for(int m = 0; m<nums.length - 1; m++)
            {
               
                if(nums[m] != nums[m+1])
                {
                    if(nums[m+1] == nums[m] + 1)
                    {
                        count++;
                    }
                    else
                    {
                       max = Math.max(max, count);
                       count = 1; // reset the count
                        
                    }
    
                }
            }
    
        return Math.max(max, count);
            

    } 
}
