import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class KidCandies {

     public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        /*  Input: candies = [2,3,5,1,3], extraCandies = 3
            Output: [true,true,true,false,true]     
            
        */
       
        ArrayList<Integer> listForMax = new ArrayList<>();
        ArrayList<Boolean> bool = new ArrayList<>();
       
        for(int i = 0; i<candies.length; i++)
        {
            listForMax.add(candies[i]); 
        }
        int max = Collections.max(listForMax);

        int addition = 0;
        for(int j = 0; j<candies.length; j++)
        {
            addition = candies[j] + extraCandies;
            if(addition >= max)
            {
                bool.add(true);
            }
            else
            {
                bool.add(false);
            }
        }
        return bool;

    }
}
