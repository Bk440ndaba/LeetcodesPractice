import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a message: ");
        String message = sc.nextLine();
        System.out.println("Number of pairs: " + getPairs(message));
    }
    public static int getPairs(String message)
    {
        /*  Enter a message: Tebello Sello is bleeding, and needs medical attention 
            Number of pairs: 5   */
        int count = 0;
        for(int i = 0; i<message.length() - 1; i++)
        {
            if(message.charAt(i) == message.charAt(i + 1))
            {
                count++;
                
            }
        }

        return count;
    }
}
