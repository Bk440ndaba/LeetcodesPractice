import java.util.HashMap;
import java.util.Map;

public class UniqueChar {
    public int firstUniqChar(String s) {
        
        /*for(int i = 0; i<s.length(); i++)
        {
            String currentChar = String.valueOf(s.charAt(i));
            boolean notUnique = false;
            for(int j = i + 1; j<s.length(); j++)
            {
                String otherChar = String.valueOf(s.charAt(j));
                if(currentChar.equals(otherChar) == true) // if a character appears more than once
                {
                    notUnique = true;
                }
            }

            if(notUnique == false) // does not appear twice
            {
                return i;
            }
        }
        return -1;
        */

        

        //Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
        /*  Input: s = "leetcode"
            Output: 0 */

             HashMap<Character, Integer> map = new HashMap<>();
            int unique = 0;

            for(int i = 0; i<s.length(); i++)
            {
                char letter = s.charAt(i);

                if(map.containsKey(letter) == true)
                {
                    map.put(letter, map.get(letter) + 1);
                }
                else{
                    map.put(letter,    1);
                }
            }

            for(int j = 0; j<s.length(); j++)
            {
                if(map.get(s.charAt(j)) == 1)  // retrieve value by using the key
                {
                    return j;
                }
            }

            return -1;
            


    }
}
