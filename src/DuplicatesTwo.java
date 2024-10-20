import java.util.HashMap;

public class DuplicatesTwo {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        /*  Input: nums = [1,2,3,1], k = 3
            Output: true  */

        HashMap<Integer, Integer> map = new HashMap<>();
        boolean duplicate = false;
        for(int i = 0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]) == true)
            {
                if(Math.abs(map.get(nums[i]) - i) <= k)
                {
                    duplicate = true;
                    
                }

                map.put(nums[i], i);
            }
            else
            {
                map.put(nums[i], i);
            }
        }

        return duplicate;

    }
}
