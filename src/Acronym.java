import java.util.List;

public class Acronym {
    public boolean isAcronym(List<String> words, String s) {
        
        /*  Input: words = ["alice","bob","charlie"], s = "abc"
            Output: true  */
        String combinedString = "";
        for(int i = 0; i<words.size(); i++)
        {
            String myString = words.get(i);
            combinedString = combinedString.concat(String.valueOf(myString.charAt(0)));
        }

        if(combinedString.equals(s))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
