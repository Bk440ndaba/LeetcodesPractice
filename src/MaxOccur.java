import java.util.ArrayList;
import java.util.Arrays;

public class MaxOccur {
    /*Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

        You can use each character in text at most once. Return the maximum number of instances that can be formed. */

        /*
         * Input: text = "nlaebolko"
            Output: 1
         */

         public int maxNumberOfBalloons(String text) {
            
                String b = "balloon";

                char [] arrayOfBallon = b.toCharArray();

                Arrays.sort(arrayOfBallon);

                String balloon = new String(arrayOfBallon);

                char [] arrayOfText = text.toCharArray();

                Arrays.sort(arrayOfText);

                String myText = new String(arrayOfText);


        
                ArrayList<Integer> list = new ArrayList<>();
                
                boolean flag = false;

                for(int i = 0; i<myText.length() - balloon.length() + 1; i++)
                {
                    String subString = myText.substring(i, i + 7);
                    if(subString.equals(balloon))
                    {
                        list.add(i);
                        flag = true;
                    }
                }
                int NumberOfOccurances = 0;

                NumberOfOccurances = list.size();

                return NumberOfOccurances;

                
         }

}
