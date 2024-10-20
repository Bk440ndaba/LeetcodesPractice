import java.util.HashMap;

public class Twosum {
    public int[] twoSum(int[] numbers, int target) {
        
        /*  Input: numbers = [2,7,11,15], target = 9
            Output: [1,2]  */
        
        HashMap<Integer, Integer> hashMapOfComplements = new HashMap<>();

        for(int i = 0; i<numbers.length; i++)
        {
            int complement = target - numbers[i];

            if(hashMapOfComplements.containsKey(complement) == true )
            {
                return new int[ ] {hashMapOfComplements.get(i), i + 1};
            }
            else
            {
                hashMapOfComplements.put(complement, i);
            }
        }

        return new int[] {0};
    }
}
