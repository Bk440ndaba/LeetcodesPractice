import java.util.*;
import java.io.*;

public class Order {
    public static void main(String[] args) {
        Scanner file = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the word lists text file: ");
        String filename = sc.nextLine();

        try {
            file = new Scanner(new FileInputStream(filename));
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        String line = "";
        while (file.hasNextLine()) 
        {
            line = file.nextLine();
            getLongest(line);
        }
        System.out.println("Done");

    }

    public static void getLongest(String line)
    {
        String [] array = line.split(" ");
        if(array.length == 1)
        {
            System.out.println("Longest is 1.");
            return;
        }

        ArrayList<Integer> list = new ArrayList<>();
        int count = 1;
        int max = 0;
        for(int i = 0;i<array.length - 1; i++)
        {
            String currentWord = array[i];
            char chaOfCurrentWord = currentWord.charAt(0);

            String nextWord = array[i+1];
            char chaOfNextWord = nextWord.charAt(0);

            if(isLess(currentWord, nextWord))
            {
                count++;
               
            }
            else
            {
                list.add(count);
                count = 1; //reset the count 
            }
            max = Math.max(count, max);
            
        }
        list.add(count);

       int counter = 0;
        for(int i = 0; i<list.size(); i++)
        {
            if(list.get(i) == max)
            {
                counter++;
               
            }
        }

        if(counter >= 2)
        {
            System.out.println("Multiple solutions length " + max + ".");
        }
        else
        {
            System.out.println("Longest is " + max + ".");
        }
      
       
      
    }

    private static boolean isLess(String word1, String word2) {
        for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
            if (word1.charAt(i) < word2.charAt(i)) {
                return true;
            } else if (word1.charAt(i) > word2.charAt(i)) {
                return false;
            }
        }
        return word1.length() < word2.length();

    }
}
