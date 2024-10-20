public class ValidPal {
    public boolean validPalindrome(String s) {
        /*  Input: s = "abca"
            Output: true
            Explanation: You could delete the character 'c'. */
            
            // this one is used to check when a letter is removed, either from left or right

            int left = 0; 
            int right = s.length() - 1;

            while(left < right)
            {
                if(s.charAt(left) != s.charAt(right))  // we do not return false, rather we call on Ispalindrome, applying it to the string with one character removed
                {
                    return IsPal(s, left + 1, right ) || IsPal(s, left, right - 1);
                }

                left++;
                right--;
            }

            return true;


    }

    public boolean IsPal(String word, int left, int right )
    {
        // This method is used to check for a palindrome without removing any letter

        

        while(left < right)
        {
            if(word.charAt(left) != word.charAt(right))
            {
                return false;
            }

            left++;
            right--;
        }

        return true;

    }
}
