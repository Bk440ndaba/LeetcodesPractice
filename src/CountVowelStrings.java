public class CountVowelStrings {
    public int vowelStrings(String[] words, int left, int right) {
        /*  Input: words = ["are","amy","u"], left = 0, right = 2
            Output: 2   */
        int count = 0;
        String myWord = "";
        for(int i = left; i <= right; i++)
        {
            myWord = words[i];
            char cB = myWord.charAt(0);
            char cE = myWord.charAt(myWord.length() - 1);

            if(cB == 'a' || cB == 'e' || cB == 'i' || cB == 'o' || cB == 'u')
            {
                if(cE == 'a' || cE == 'e' || cE == 'i' || cE == 'o' || cE == 'u')
                {
                    count++;
                }
            }

            
        }

        return count;
    }
}
