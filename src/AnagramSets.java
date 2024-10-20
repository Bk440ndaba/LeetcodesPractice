import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramSets {
    public static void main(String[] args) {
        Scanner file = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the filename: ");
        String filename = sc.nextLine();

        try {
            file = new Scanner(new FileInputStream(filename));
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        String line = "";

        System.out.println("Enter the word length: ");
        int length = sc.nextInt();

       
        ArrayList<String> list = new ArrayList<>();
        while(file.hasNextLine())
        {
            line = file.nextLine();
            list.add(line);
            
        }
    
       
        ArrayList<String> listOfSets = new ArrayList<>();
        String word = "";
        for(int i = 0; i<list.size(); i++)
        {
             word = list.get(i);
            String s = "";
            for(int j = i+1; j<list.size(); j++)
            {
                s = list.get(j);
                if(isAnagram(word, s))
                {
                    listOfSets.add(word);
                    listOfSets.add(s);
                }
            }
        }
       
        System.out.println(listOfSets);
    }

   
    

    public static boolean isAnagram(String word, String s)
    {
        char [] arrayOfW = word.toCharArray();
        char [] arrayOfS = s.toCharArray();

        Arrays.sort(arrayOfS);
        Arrays.sort(arrayOfW);

        String w = String.valueOf(arrayOfW);
        String ss = String.valueOf(arrayOfS);

        return w.equals(ss);
    }
}
