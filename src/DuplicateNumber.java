import java.util.HashSet;

public class DuplicateNumber {
    public int findDuplicate(int[] nums) {
        /*  Input: nums = [1,3,4,2,2]
            Output: 2  */

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<nums.length; i++)
        {
            if(set.contains(nums[i]) == true)
            {
                return nums[i];
            }
            else
            {
                set.add(nums[i]);
            }
        }

        return 0;
        
    }
}
