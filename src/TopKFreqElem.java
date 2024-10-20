import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class TopKFreqElem {
    public int[] topKFrequent(int[] nums, int k) {
        /*  Input: nums = [1,1,1,2,2,3], k = 2
            Output: [1,2]   */

        /*if(nums.length <= 2)
        {
            return nums;
        }
        */

       

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            list.add(entry.getValue());
        }

        Collections.sort(list);

        int [] arrayDescending = new int[list.size()];
        int m = 0;
        for(int j = list.size() - 1; j >= 0; j--)
        {
            arrayDescending[m] = list.get(j);
            m++;
        }

        for(int l = 0; l < k; l++)
        {
            for(Map.Entry<Integer, Integer> entry : map.entrySet())
            {
                if(arrayDescending[l] == entry.getValue())
                {
                    set.add(entry.getKey());
                }
            }
        }

        int [] fArray = new int[set.size()];
        int h = 0;

        for(Integer ele : set)
        {
            fArray[h] = ele;
            h++;
        }

        return fArray;
       
    }
}
