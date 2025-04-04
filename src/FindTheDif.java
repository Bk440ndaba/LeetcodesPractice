/*String t is generated by random shuffling string s and then add one more letter at a random position.

Return the letter that was added to t.

 

Example 1:

Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added. */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindTheDif {
    public static void main(String[] args) {
        String s = "a";
        String t = "aa";

        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
       HashMap<Character, Integer> map = new HashMap<>();

       if(s.isEmpty())
       {
            char c = t.charAt(0);
            return c;

       }

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
       System.out.println(map);

       

       for(int i = 0; i<t.length(); i++)
       {
            if(map.containsKey(t.charAt(i)))
            {
                map.put(t.charAt(i), map.get(t.charAt(i)) + 1);
            }
            else
            {
                map.put(t.charAt(i), 1);
            }
       }

       System.out.println(map);

       char b = ' ';
       for(Map.Entry<Character, Integer> entry : map.entrySet())
       {
            if(entry.getValue() == 1)
            {
                b =  entry.getKey();
            }
       }

       return b;


    }
}
