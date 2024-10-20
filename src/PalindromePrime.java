import java.util.Scanner;

public class PalindromePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting point N: ");
        int n = sc.nextInt();

        System.out.println("Enter the ending point M: ");
        int m = sc.nextInt();

        System.out.println("The palindromes primes are: ");
        for(int i = n; i<= m; i++)
        {
            if(i > 1 && isPalindrome(i) && isPrime(i))
            {
                System.out.println(i);
            }
        }

    }

    public static boolean isPalindrome(int num)
    {
        String number = String.valueOf(num);

        int left = 0;
        int right = number.length() - 1;

        while(left < right )
        {
            if(String.valueOf(number.charAt(left)).equals(String.valueOf(number.charAt(right))))
            {
                left++;
                right--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int value)
    {
        for(int i = 2; i<= Math.sqrt(value); i++)
        {
            if(value % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
