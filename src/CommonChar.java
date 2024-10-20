import java.util.*;

public class CommonChar {
    public ArrayList<String> commonChars(String[] words) {
        /*  Input: words = ["bella","label","roller"]
            Output: ["e","l","l"]   */
        
        String first = words[0];
        HashSet<Character> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i<first.length(); i++)
        {
            set.add(first.charAt(i));
        }

        for(int i = 1; i<words.length; i++)
        {
            
        }

        return list;

    }
}
