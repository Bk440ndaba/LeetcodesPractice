import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        LargestNumber ls = new LargestNumber();
        int [] array = {10,2};

        String reString = ls.largestNumber(array);
        System.out.println(reString);

       //ArrayList<String> reList = new ArrayList<>();
       //reList = ls.largestNumber(array);
       //System.out.println(reList);
    }
    public String largestNumber(int[] nums) {
        /*  Input: nums = [10,2]
            Output: "210"   */

        StringBuilder sb = new StringBuilder();
        String firsString = "";

        String [] aaStrings = new String[nums.length];

        for(int i = 0; i<aaStrings.length; i++)
        {
            aaStrings[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(aaStrings, new Comparator<String>() {
            
            @Override

            public int compare(String a, String b)
            {
                String ab = a + b;
                String ba = b+ a;

                return ba.compareTo(ab);
            }
        });

        for(int i = 0; i<aaStrings.length; i++)
        {
            sb.append(aaStrings[i]);
        }
        
        firsString = sb.toString();

        if(aaStrings[0].equals("0"))
        {
            return "0";
        }
       
        return firsString;
        

        

        


    }
}
