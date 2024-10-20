import java.io.*;
import java.util.*;

public class SimpleMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pattern = "";
        String word = "";
        while(true)
        {
            System.out.println("Enter a pattern (or 'q' to quit): ");
            pattern = sc.nextLine();

            if(pattern.equals("q"))
            {
                break;
            }

           
            System.out.println("Enter a word: ");
            word = sc.nextLine();

            boolean match = false;
            
            if(word.length() != pattern.length())
            {
                System.out.println("They don't match.");
                return;
                
            }
            else
             {
                
                for(int i = 0; i<word.length(); i++)
                {
                    if(word.charAt(i) == pattern.charAt(i) || word.charAt(i) == '?')
                    {
                        match = true;
                    }
                }
            }

            

            if(match == true)
            {
                System.out.println("It's a match");
            }
            else
            {
                System.out.println("They don't match");
            }

        }



    }
}
