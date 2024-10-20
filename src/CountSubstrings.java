public class CountSubstrings {
    public static void main(String[] args) {
        CountSubstrings cb = new CountSubstrings();
        String test = "zzz";
        char myTest = 'z';

        long result = cb.countSubstrings(test, myTest);
        System.out.println(result);
    }
    public long countSubstrings(String s, char c) {
        
        /*You are given a string s and a character c. Return the total number of substrings
        of s that start and end with c.  
        
        
        Input: s = "abada",  c = "a"
        Output:     6

        */
        int counter = 0;
        for(int i = 0; i<s.length(); i++)
        {
            String sub = "";
            for(int j = i; j < s.length(); j++)
            {
                sub = sub + String.valueOf(s.charAt(j));

                if(sub.startsWith(String.valueOf(c)) &&  sub.endsWith(String.valueOf(c)))
                {
                    counter++;
                }
            }

            sub = ""; //reset sub;
        }

        return counter;

    }
}
