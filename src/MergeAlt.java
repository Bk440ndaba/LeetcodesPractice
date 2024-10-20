public class MergeAlt {
    public static void main(String[] args) {
        MergeAlt alt = new MergeAlt();
        String word1 = "abc";
        String word2 = "pqrs";

        String fString = alt.mergeAlternately(word1, word2);
        System.out.println(fString);
    }
    public String mergeAlternately(String word1, String word2) {
        
        /*  Input: word1 = "abc", word2 = "pqr"
            Output: "apbqcr" */

            int index = 0;
            String result = "";

            
             while(index < word1.length() || index < word2.length())
                {
                    

                    if(index < word1.length())
                    {
                        result = result + String.valueOf(word1.charAt(index));
                    }

                    if(index < word2.length())
                    {
                        result = result + String.valueOf(word2.charAt(index));   
                    }
                    index++;
                 }
            return result;
            
            
    }
}
