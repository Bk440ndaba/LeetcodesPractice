public class ConsistentString {
    public int countConsistentStrings(String allowed, String[] words) {
        /*  Input: allowed = "ab",  words = ["ad","bd","aaab","baa","badab"]
            Output:  2  */

        int count = 0;
        for(int i = 0; i<words.length; i++)
        {
            String word = words[i];
            if(allowed.length() >= word.length())
            {
                if(allowed.contains(word))
                {
                    count++;
                }
            }
            else
            {
                if(word.contains(allowed))
                {
                    count++;
                }
            }
        }

        return count;

    }
}
