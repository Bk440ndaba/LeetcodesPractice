import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortColors {
    public static void main(String[] args) {
        SortColors st = new SortColors();
        //int [] numbers = {2,0,2,1,1,0};
        int [] numbers = {2,0,1};

        //ArrayList<Integer> result = new ArrayList<>();
       // result = st.sortColors(numbers);
        //System.out.println(result);
        st.sortColors(numbers);
    }
    public void sortColors(int[] nums) {
        
        /*  Input: nums = [2,0,2,1,1,0]
        Output: [0,0,1,1,2,2]   
        
        */
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new  ArrayList<>();


        for(int i = 0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i]) + 1);

            }
            else
            {
                map.put(nums[i], 1);
            }
        }

        int numberOfZeros = 0;
        int numberOfOnes = 0;
        int numberOfTwos = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getKey() == 0)
            {
                numberOfZeros = entry.getValue();
            }
            else if(entry.getKey() == 1)
            {
                numberOfOnes = entry.getValue();
            }
            else
            {
                numberOfTwos = entry.getValue();
            }
        }

        
        if(numberOfZeros != 0)
        {
             for(int i = 0; i<numberOfZeros; i++)
            {
            list.add(0);

            }
        }

        
        if(numberOfOnes != 0)
        {
             for(int i = 0; i<numberOfOnes; i++)
            {
            list.add(1);
            
            }
        }

        
        if(numberOfTwos != 0)
        {
             for(int i = 0; i<numberOfTwos; i++)
            {
            list.add(2);
            
            }
        }

   /// System.out.println(list);
    for(int i = 0; i<list.size(); i++)
    {
        nums[i] = list.get(i);
    }

    for(int i = 0; i<nums.length; i++)
    {
        System.out.print(nums[i] + " ");
    }

        
    
    
    
    
        
    }
}
