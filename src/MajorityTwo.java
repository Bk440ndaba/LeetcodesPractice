import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MajorityTwo {
    public ArrayList<Integer> majorityElement(int[] nums) {
        /*  Input: nums = [3,2,3]
            Output: [3]  */

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        
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

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue() > n/3)
            {
                list.add(entry.getKey());
            }
        }

        return list;
    }
}
