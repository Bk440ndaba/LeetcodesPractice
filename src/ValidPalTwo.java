public class ValidPalTwo {
    public static void main(String[] args) {
        ValidPalTwo vp = new ValidPalTwo();
        String s = "A man, a plan, a canal: Panama";
        //String s = "0P";
        boolean result = vp.isPalindrome(s);
        System.out.println(result);
    }
    public boolean isPalindrome(String s) {
        
        /*   Input: s = "A man, a plan, a canal: Panama"
            Output: true
            Explanation: "amanaplanacanalpanama" is a palindrome.  */
            s = s.toLowerCase();
            StringBuilder newString = new StringBuilder();
            String finalString = "";

             for(int i = 0; i<s.length(); i++)
            {
               //boolean number = Character.isDigit(s.charAt(i));
                boolean Alpha = Character.isLetterOrDigit(s.charAt(i));


                if(Alpha == true)
                {
                    newString.append(s.charAt(i));
                }

            }

            finalString = newString.toString();
            /*if(finalString.length() == 1)
            {
                return false;
            }
            */

            int left = 0;
            int right = finalString.length() - 1;

            while(left < right)
            {
                if(finalString.charAt(left) != finalString.charAt(right))
                {
                    return false;
                }
                left++;
                right--;

            }
            
            
            

            return true;
            

           
    }
}
