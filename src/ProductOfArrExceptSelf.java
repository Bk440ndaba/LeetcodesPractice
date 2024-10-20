import java.util.ArrayList;

public class ProductOfArrExceptSelf {
    public static void main(String[] args) {
        ProductOfArrExceptSelf ps = new ProductOfArrExceptSelf();
        int [] nums = {1, 2, 3, 4};
        
    }
    public int [] productExceptSelf(int[] nums) {
        /*  Input: nums = [1,2,3,4]
            Output: [24,12,8,6]     */

        // Prefix and suffix products

        int [] prefix = new int[nums.length];
        int [] suffix = new int[nums.length];

        int [] products = new int[nums.length];
        prefix[0] = 1; // because there are no elements before arr[0]
        suffix[nums.length - 1] = 1; // because we have no elements on after the last element

        // finding the prefix products

        for(int i = 1; i<prefix.length; i++)
        {
            //current prefix product = prev pref product * previous element
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        // finding the suffix sums
        for(int j = nums.length - 2; j >= 0; j--)
        {
            //current suff sum = next suff sum * next element in array
            suffix[j] = suffix[j+1] * nums[j+1];
        }

        for(int i = 0; i<nums.length; i++)
        {
            products[i] = prefix[i] * suffix[i];
        }

        return products;

        
        
        
    }

    /*int [] array = new int[nums.length];  The brute force approach

       
        for(int i =0; i<nums.length; i++ )
        {
            int product = 1;
            for(int j = 0; j<array.length; j++)
            {
                if(i == j)
                {
                    continue;
                }
                else{
                    product = product * nums[j];
                }
            }
            array[i] = product;
        }
        return array;

        */
}
