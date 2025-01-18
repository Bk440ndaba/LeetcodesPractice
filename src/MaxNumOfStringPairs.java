import java.util.Arrays;
import java.util.HashMap;

public class MaxNumOfStringPairs {
        public static void main(String[] args) {
            MaxNumOfStringPairs mx = new MaxNumOfStringPairs();
            String [] wordss = {"cd","ac","dc","ca","zz"};
            System.out.println(maximumNumberOfStringPairs(wordss));

            
        }

    public static int maximumNumberOfStringPairs(String[] words) {
        
        /*  Input: words = ["cd","ac","dc","ca","zz"]
            Output: 2 */
           
            int count = 0;
            for(int i = 0; i<words.length; i++)
            {
              HashMap<String, String> map = new HashMap<>();

            }
          return count; 
    }
       
}
