public class LongestIncreasing {
    public static void main(String[] args) {
        LongestIncreasing l = new LongestIncreasing();
        int [] arr = {10, 9, 2, 5, 3,7, 101, 18};
        int result = l.lengthOfLIS(arr);
        System.out.println(result);
    }
    public int lengthOfLIS(int[] nums) {
        /*  Input: nums = [10,9,2,5,3,7,101,18]
            Output: 4  */

        int max = 0;
        int count = 1;

        for(int i = 0; i<nums.length; i++)
        {
            for(int j = i + 1; j<nums.length ; j++)
            {
                if(nums[i] != nums[j])
                {
                    if(nums[i] < nums[j])
                    {
                        count++;
                    }
                }
            }
            max = Math.max(max, count);
            count = 0; // reset count
        }

        return max;

    }
}
