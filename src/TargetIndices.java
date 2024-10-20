import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndices {
    public static void main(String[] args) {
        TargetIndices ti = new TargetIndices();
        
        int [] nums = {1, 2, 5, 2, 3};
        
        System.out.println(ti.targetIndices(nums, 2));
    }
    public ArrayList<Integer> targetIndices(int[] nums, int target) {
        /*  Input: nums = [1,2,5,2,3], target = 2
            Output: [1,2]   */
        Arrays.sort(nums);

        ArrayList<Integer> list = new ArrayList<>();

       /*  int low = 0;
        int high = nums.length - 1;

        while(low <= high)
        {
            int middlePosition = (low + high) / 2;
            if(target == nums[middlePosition])
            {
                list.add(middlePosition);
            }
            if(target < nums[middlePosition])
            {
                high = middlePosition - 1;
            }
            else
            {
                low = middlePosition + 1;
            }
        }

        */

        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] == target)
            {
                list.add(i);
            }
        }

        return list;
    }
}
