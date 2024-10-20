public class HalveStrings {
    public boolean halvesAreAlike(String s) {
        /*  Input: s = "book"
            Output: true    */
        String newS = s.toLowerCase();

        if(newS.equals(""))
        {
            return false;
        }

        int countOne = 0;
        int countTwo = 0;
        for(int i = 0; i<newS.length() /2; i++)
        {
            if(isVowel(newS.charAt(i)))
            {
                countOne++;
            }
        }

        for(int i = newS.length()/2; i<newS.length(); i++)
        {
            if(isVowel(newS.charAt(i)))
            {
                countTwo++;
            }
        }

        if(countOne == countTwo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isVowel(char c)
    {
        return c == 'a' ||c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
