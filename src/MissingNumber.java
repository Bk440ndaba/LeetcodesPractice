import java.util.Arrays;
import java.util.HashSet;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        
        /*  Input: nums = [3,0,1]
            Output: 2 */

        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;

        for(int i = 0; i<nums.length; i++)
        {
            set.add(nums[i]);
        }

        for(int j = 0; j<=n; j++)
        {
            if(set.contains(j) == false)
            {
                return j;
            }
        }
        return -1;

    }
}
