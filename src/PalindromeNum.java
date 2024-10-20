public class PalindromeNum {
    public boolean isPalindrome(int x) {
        /*  Input: x = 121
            Output: true */

            if( x < 0)
            {
                return false;
            }

            String num = String.valueOf(x);

            int left = 0;
            int right = num.length() - 1;

            while(left < right)
            {
                if(num.charAt(left) !=num.charAt(right))
                {
                    return false;
                }
                left++;
                right--;
            }
            return true;
    }
}
