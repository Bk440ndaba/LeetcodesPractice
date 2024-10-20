import java.util.Scanner;

public class Breakup {
    public static void main(String[] args) {
        /*  Enter a sentence: Jerusalema ikhaya LAMI
            The word list: jerusalema, ikhaya, lami.  */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");

        String sentence = sc.nextLine();

        System.out.println("The word list is: " + breakUp(sentence) + ".");
    }

    public static String breakUp(String sentence)
    {
        String words = sentence.toLowerCase();
        String [] list = words.split(" ");

        String phrase = list[0];

        for(int i = 1; i<list.length; i++)
        {
            phrase = phrase +"," + " " + list[i]; 
        }
        return phrase;
    }


}
