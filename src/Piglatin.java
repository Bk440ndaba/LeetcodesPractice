import java.util.*;
import java.io.*;

public class Piglatin {
    public static void main(String[] args) {
        Piglatin pg = new Piglatin();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String line = sc.nextLine();
        System.out.println(pigLatin(line));
        
    }

    public static boolean isVowel(char c)
    {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }


    public static String pigLatin(String line)
    {
        String sent = line.toLowerCase();
        String [] array = sent.split(" ");

        for(int i = 0; i<array.length; i++)
        {
            String word = array[i];
            String notVowel = "";
            if(isVowel(word.charAt(0)))
            {
                word = word + "way";
                array[i] = word;
            }
            else
            {
                
                for(int j = 0; j<word.length(); j++)
                {
                    if(isVowel(word.charAt(j)))
                    {
                        notVowel = word.substring(j) +  "a" + word.substring(0, j) + "ay";
                        break;
                    }
                }
                array[i] = notVowel;
            }
        }

        String pigLatin = "";
        for(int i= 0; i<array.length; i++)
        {
            pigLatin = pigLatin + array[i] + " ";
        }
        return pigLatin;
        
    }
}
