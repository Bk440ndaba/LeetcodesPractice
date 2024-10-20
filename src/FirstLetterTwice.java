import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FirstLetterTwice {
    public char repeatedCharacter(String s) {
        /*  Input: s = "abccbaacz"
            Output: "c" */
        
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();

        for(int i = 0; i<s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)) == true)
            {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1 );
                break;
            }
            else{
                map.put(s.charAt(i),  1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 2)
            {
                list.add(entry.getKey());
            }
        }

        char letter = ' ';
        letter = list.get(0);
        return letter;

    }
}
