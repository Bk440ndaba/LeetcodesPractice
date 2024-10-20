public class LongestPalindrome {
    public int longestPalindrome(String s) {
        
    }

    public static boolean isPalindrome(String sub)
    {
        int left = 0;
        int right = sub.length() - 1;

        while(left < right)
        {
            if(sub.charAt(left) != sub.charAt(right))
            {
                return false;
            }
            else
            {
                left++;
                right--;
            }
        }

        return true;

    }
}
