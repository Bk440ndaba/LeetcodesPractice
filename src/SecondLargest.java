import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SecondLargest {
    public int secondHighest(String s) {
        /*  Input: s = "dfa12321afd"
            Output: 2   */

       LinkedHashSet<Integer> set = new LinkedHashSet<>();
       ArrayList<Integer> list = new ArrayList<>();


       for(int i = 0; i<s.length(); i++)
       {
            if(Character.isDigit(s.charAt(i)))
            {
                list.add(Integer.parseInt(String.valueOf(s.charAt(i))));

            }
       }

       Collections.sort(list);
       for(int i = list.size() - 1; i >= 0; i--)
       {
        set.add(list.get(i));
       }

       if(set.size() == 1 || set.size() == 0)
       {
        return -1;
       }
      
       int [] array = new int[set.size()];
       int i = 0;
       for (Integer ele : set) {
        
            array[i] = ele;
            i++;
       }

       return array[1];
       

    }
}
