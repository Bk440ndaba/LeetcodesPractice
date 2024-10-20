import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;

public class SumOfUnique {
    public int sumOfUnique(int[] nums) {
      /*    Input: nums = [1,2,3,2]
            Output: 4   */  

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]) == true)
            {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else
            {
                map.put(nums[i], 1);
            }
        }

        int total = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 1)
            {
                total = total + entry.getValue();
            }
        }

        return total;

    }
}
