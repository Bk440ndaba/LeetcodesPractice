import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Dup {

    public static void main(String[] args) {
        Dup dup = new Dup();
        int [] nums = {-3,-1,0,0,0,3,3};

        HashSet<Integer> mySet = dup.removeDuplicates(nums);
        System.out.println(mySet);
    }
    public int removeDuplicates(int[] nums)
    {
        /*  Input: nums = [1,1,2]
            Output: 2, nums = [1,2,_]
            Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
            It does not matter what you leave beyond the returned k (hence they are underscores). */

            LinkedHashSet<Integer> set = new LinkedHashSet<>();

            for(int i = 0; i<nums.length; i++)
            {
                if(set.contains(nums[i]) == false)
                {
                    set.add(nums[i]);
                }
            }
            int answer = set.size();
            
            int i = 0;

            for(Integer element : set){
                nums[i] = element;
                i++;
            }

            //Arrays.sort(nums);

            return answer;
            
            //return set;
    }
}
