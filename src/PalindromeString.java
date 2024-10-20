import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String line = sc.nextLine();

        if(isPalString(line))
        {
            System.out.println("Palindrome!");
        }
        else
        {
            System.out.println("Not a palindrome!");
        }
    }
    
    public static boolean isPalString(String line)
    {
        String sentence = line.replaceAll(" ", "");
        int left = 0;
        int right = sentence.length() - 1;

        while(left < right)
        {
            if(sentence.charAt(left) == sentence.charAt(right))
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
}
