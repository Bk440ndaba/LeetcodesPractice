import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {

        /*  Input: digits = [1,2,3]
            Output: [1,2,4] */

            int lastNumber = digits[digits.length - 1];

            for(int i = lastNumber; i >= 0; i--)
            {
                if(digits[i] < 9)
                {
                    digits[i]++;
                    return digits;
                }
                else{
                    digits[i] = 0; // set the index of containing 9 to be 0, the carry over
                }
            }

            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
           
            

            
            
    }
}
