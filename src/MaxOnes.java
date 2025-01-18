public class MaxOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        /*  Input: nums = [1,1,0,1,1,1]
            Output: 3    */

        int max = 0;  // keeps track of max number
        int count = 0;

        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] == 1)
            {
                count++;
                max = Math.max(max, count);
            }
            else{
                count = 0;
            }
        }

        return max;
    }
}
