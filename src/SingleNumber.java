import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        /*  Input: nums = [2,2,1]
            Output: 1 */

            // Hashmap to store values and their count
            int count = 0;

            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i<nums.length; i++)
            {
                int element = nums[i];
                if(map.containsKey(element) == true)
                {
                    map.put(element, map.get(element) + 1);
                }
                else{
                    map.put(element,   1);
                }
            }

            for(Map.Entry<Integer, Integer> entry: map.entrySet())

            {
                if(entry.getValue() == 1)
                {
                    count = entry.getKey();
                }
            }

            return count;
    }
}
