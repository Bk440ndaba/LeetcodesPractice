import java.util.HashMap;
import java.util.Map;

public class Pangram {
    public boolean checkIfPangram(String sentence) {
        /*Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
            Output: true */

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        map1.put('a', 1);
        map1.put('b', 1);
        map1.put('c', 1);
        map1.put('d', 1);
        map1.put('e', 1);
        map1.put('f', 1);
        map1.put('g', 1);
        map1.put('h', 1);
        map1.put('i', 1);
        map1.put('j', 1);
        map1.put('k', 1);
        map1.put('l', 1);
        map1.put('m', 1);
        map1.put('n', 1);
        map1.put('o', 1);
        map1.put('p', 1);
        map1.put('q', 1);
        map1.put('r', 1);
        map1.put('s', 1);
        map1.put('t', 1);
        map1.put('u', 1);
        map1.put('v', 1);
        map1.put('w', 1);
        map1.put('x', 1);
        map1.put('y', 1);
        map1.put('z', 1);

        for(int i = 0; i<sentence.length(); i++)
        {
            if(map2.containsKey(sentence.charAt(i)) == true)
            {
                map2.put(sentence.charAt(i), map2.get(sentence.charAt(i)));
            }
            else
            {
                map2.put(sentence.charAt(i), 1);
            }
        }

        char key;
        for(Map.Entry<Character, Integer> entry : map1.entrySet())
        {
            key = entry.getKey();
           

            if(map2.containsKey(key) == false)
            {
                return false;
            }
        }
        return true;

       



    }
}
