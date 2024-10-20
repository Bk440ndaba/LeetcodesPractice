import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AnagramSearch {
    public static void main(String[] args) {
        Scanner file = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        ArrayList<String> list = new ArrayList<>();

        try {
            file = new Scanner(new FileInputStream("EnglishWords.txt")); 
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        String line = "";
        while(file.hasNextLine())
        {
            line = file.nextLine();
           
                if(anagramSearch(word, line))
                {
                    list.add(line);
                }
            
        }

        list.remove(word);
        System.out.println("***** Anagram Finder *****");
        if(list.isEmpty())
        {
            System.out.println("Sorry, anagrams of " + word + " could not be found.");
        }
        else
        {
            
            Collections.sort(list);
            System.out.println(list);
        }
    }



    public static boolean anagramSearch(String word, String line)
    {
        char [] arrayOfWord = word.toCharArray();
        char [] arrayOfLine = line.toCharArray();

        Arrays.sort(arrayOfWord);
        Arrays.sort(arrayOfLine);

        String sortedWord = String.valueOf(arrayOfWord);
        String sortedLine = String.valueOf(arrayOfLine);

        return sortedWord.equals(sortedLine);
    }
}
