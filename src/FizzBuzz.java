import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        /*  Input: n = 3
            Output: ["1","2","Fizz"] */

        String [] array = new String[n];

        for(int i = 1; i<= n; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                array[i] = "FizzBuzz";
            }
            else if(i % 3 == 0)
            {
                array[i] = "Fizz";
            }
            else if(i % 5 == 0)
            {
                array[i] = "Buzz";
            }
            else
            {
                array[i] = String.valueOf(i);
            }
        }
        List<String> list = new ArrayList<>();
        for(int j = 0; j<array.length; j++)
        {
            list.add(array[j]);
        }

        return list;
    }
}
