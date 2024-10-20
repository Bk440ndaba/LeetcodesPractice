import java.util.HashSet;

public class FindTheDiff {
    public char findTheDifference(String s, String t) {
        /*  Input: s = "abcd", t = "abcde"
            Output: "e" */
        char Fchar = ' ';
        if(s.equals(""))
        {
            char myT = t.charAt(0);
            return myT;
        }

        char [] array = s.toCharArray();

        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i<array.length; i++)
        {
            set.add(array[i]);
        }
        
        for(int i = 0; i<t.length(); i++)
        {
            if(set.contains(t.charAt(i)) == false)
            {
                Fchar = t.charAt(i);
            }
        }

        
        return Fchar;
    }
}
