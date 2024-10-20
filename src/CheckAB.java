import java.util.ArrayList;

public class CheckAB {
    public boolean checkString(String s) {
        /*  Input: s = "aaabbb"
            Output: true  */
        if(s.length() == 0)
        {
            return false;
        }

        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i<s.length(); i++)
        {
            list.add(s.charAt(i));
        }
        if(list.contains('a') == false)
        {
            return true;
        }
        if(list.contains('b') == false)
        {
            return true;
        }

        int firstIndexOfB = s.indexOf('b');
        int lastIndexOfA = s.lastIndexOf('a');

        if(lastIndexOfA < firstIndexOfB)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
