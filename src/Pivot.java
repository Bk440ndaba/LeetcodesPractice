public class Pivot {
 
        public int pivotIndex(int[] nums) {
        /* Input: nums = [1,7,3,6,5,6]
            Output: 3
            Explanation:  The pivot index is 3.
            Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
        Right sum = nums[4] + nums[5] = 5 + 6 = 11  */

       int totalSum = 0;
       for(int i = 0; i<nums.length; i++)
       {
        totalSum = totalSum + nums[i];
       }

       int leftSum = 0;
       int rightSum = 0;

       for(int i = 0; i<nums.length; i++)
       {
            rightSum = totalSum - leftSum - nums[i];
            if(rightSum == leftSum)
            {
                return i;
            }
            leftSum = leftSum + nums[i];

       }
       return -1;
    }
}
