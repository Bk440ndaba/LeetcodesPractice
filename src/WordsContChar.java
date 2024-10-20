import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WordsContChar {
    public List<Integer> findWordsContaining(String[] words, char x) {
        /*  Input: words = ["leet","code"], x = "e"
            Output: [0,1]  */

        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<words.length; i++)
        {
            String word = words[i];
            for(int j = 0; j<word.length(); j++)
            {
                if(word.charAt(j) == x)
                {
                    set.add(i);
                }
            }
        }
        
        for (Integer ele : set) {
            list.add(ele);

        }

        return list;
    }
}
