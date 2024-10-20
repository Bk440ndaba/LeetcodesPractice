public class BeautifulStrings {
    public int beautifulSubstrings(String s, int k) {
        /*  Input: s = "baeyh", k = 2
            Output: 2  */
        int beautifulSubstrings = 0;
        for(int i = 0; i < s.length(); i++)
        {
            int counterForVowels = 0;
            int counterForConso =  0;


            for(int j = i; j<s.length(); j++)
            {
                if(isVowel(s.charAt(j)))
                {
                    counterForVowels++;
                }
                else
                {
                    counterForConso++;
                }

                if(counterForConso == counterForVowels &&  counterForConso * counterForVowels % k == 0)
                {
                    beautifulSubstrings++;
                }
            }
            
        }

        return beautifulSubstrings;

        
    }

    public boolean isVowel(char c)
    {
        if(c == 'a' || c == 'e' || c == 'i' || c == '0' || c == 'u')
        {
            return true;
        }
        else
        {
            return false;
        }
       
    }
}
