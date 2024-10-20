import java.util.Arrays;

public class MoveZ {
    public void moveZeroes(int[] nums) {
        
        //Arrays.sort(nums);

        int j = 0;

        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] != 0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
                
            }
            
        }
    }
}
