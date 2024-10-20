import java.util.*;

public class ShuffleString {
    public static void main(String[] args) {
        ShuffleString sf = new ShuffleString();
        String s = "codeleet";
        int [] indices = {4,5,6,7,0,2,1,3};
        sf.restoreString(s, indices);
        
        
    }
    public void restoreString(String s, int[] indices) {
        /*  Input: s = "codeleet",      indices = [4,5,6,7,0,2,1,3]
            Output: "leetcode"  */

        HashMap<Integer, Character> map = new HashMap<>();

        for(int i = 0; i<s.length(); i++)
        {
            map.put( indices[i], s.charAt(i));
        }

        String word = "";
        for(int i = 0; i<s.length(); i++)
        {
            for(Map.Entry<Integer, Character> entry : map.entrySet())
            {
                if(entry.getKey() == i)
                {
                    word = word + entry.getValue();
                }
            }
        }

       // return word;
       System.out.println(word);
        
    }
}
