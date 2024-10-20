import java.util.HashSet;

public class LongestSub {
    public int lengthOfLongestSubstring(String s) {
        
        /*  Input: s = "abcabcbb"
            Output: 3  
            
            Idea is to add the next char to the substring ONLY if this char has not be added before
            if it has been added before, we remoove all those that came before it until we remove it's duplicate
            
            */
       
        HashSet<Character> set = new HashSet<>();

        int removeIndex = 0;
        int max = 0;

        for(int i = 0; i<s.length(); i++)
        {
            while(set.contains(s.charAt(i)) == true)
            {
                set.remove(s.charAt(removeIndex));
                removeIndex++;
            }

            set.add(s.charAt(i));

            max = Math.max(max, set.size());
        }

        return max;

       

    }
}
