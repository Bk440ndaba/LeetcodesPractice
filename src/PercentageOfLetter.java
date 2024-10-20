import java.util.HashMap;
import java.util.Map;

public class PercentageOfLetter {
    public int percentageLetter(String s, char letter) {
        /*  Input: s = "foobar", letter = "o"
            Output: 33   */

        
        HashMap<Character, Integer> map = new HashMap<>();

        int percentage = 0;
        for(int i = 0; i<s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else
            {
                map.put(s.charAt(i), 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            if(letter == entry.getKey())
            {
                percentage = entry.getValue() * 100 / s.length();
            }
        }

        return percentage;
    }
}
