public class Rem {

    public int removeElement(int[] nums, int val) {

        /*  Input: nums = [3,2,2,3], val = 3
            Output: 2, nums = [2,2,_,_]  */
            int index = 0;
            int[] arr = new int[nums.length];

            for(int i = 0; i<nums.length; i++)
            {
                if(nums[i] != val)
                {
                    arr[index] = nums[i];
                    index++;
                }
            }

        for(int j = 0; j<arr.length; j++)
        {
            nums[j] = arr[j];
        }

        return index;
    
            
    }
}
