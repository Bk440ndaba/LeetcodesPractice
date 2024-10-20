import java.util.ArrayList;
import java.util.HashSet;

public class ArrayInterSect {
    public int[] intersection(int[] nums1, int[] nums2) {
        /*  Input: nums1 = [1,2,2,1], nums2 = [2,2]
            Output: [2] */

       
        HashSet<Integer> set = new HashSet<>(); // contains num 1 elements
        HashSet<Integer> Myset = new HashSet<>();
    
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<nums1.length; i++)
        {
            set.add(nums1[i]);
        }

        for(int j = 0; j<nums2.length; j++)
        {
            if(set.contains(nums2[j]))
            {
                Myset.add(nums2[j]);
            }
        }

        int [] array = new int[Myset.size()];

        int i = 0;
        for(Integer ele : Myset)
        {
            array[i] = ele;
            i++;
        }

        return array;
    }
}
