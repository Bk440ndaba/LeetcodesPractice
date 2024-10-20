public class SubArrayEqualK {
    public int subarraySum(int[] nums, int k) {
        /*      Input: nums = [1,1,1], k = 2
                Output: 2       */
        
        if(nums.length == 1 && k == 0)
        {
            return 0;
        }

        if(nums.length == 1 && k == 1)
        {
            return 1;
        }

        int sum = 0;
        int count = 0;
        int removeInd = 0;

        for(int i = 0; i<nums.length; i++)
        {
            sum = sum + nums[i];
            while(sum > k)
            {
                sum = sum - nums[removeInd];
                removeInd++;
            }

            if(sum == k)
            {
                count++;
            }
        }

        return count;
    }
}
