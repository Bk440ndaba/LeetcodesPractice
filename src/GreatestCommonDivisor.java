import java.util.Arrays;

public class GreatestCommonDivisor {
    public int findGCD(int[] nums) {
        /*  Input: nums = [2,5,6,9,10]
            Output: 2

            Explanation:
            The smallest number in nums is 2.
            The largest number in nums is 10.
            The greatest common divisor of 2 and 10 is 2.
            
            */
        Arrays.sort(nums);
        int smallest = nums[0];
        int largest = nums[nums.length - 1];
        int gcd = 0;

        for(int i = 1; i<largest; i++)
        {
            if(smallest % 2 == 0 && largest % 2 == 0)
            {
                gcd = i;
                break;
            }
        }
        return gcd;
    }
}
