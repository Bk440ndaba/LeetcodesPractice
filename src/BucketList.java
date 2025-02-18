import java.io.*;
import java.util.*;

public class BucketList {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the categories file: ");
        String filename = sc.nextLine();

        System.out.println("Enter a comma-separated list of words: ");
        String sentence = sc.nextLine();

        ArrayList<String> listOfCategories = new ArrayList<>();
        try (Scanner file = new Scanner(new FileInputStream(filename))) {
            while (file.hasNextLine()) {
                listOfCategories.add(file.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        String[] words = sentence.split(",");
        ArrayList<String> listOfWords = new ArrayList<>(Arrays.asList(words));

        categorise(listOfCategories, listOfWords);
    }

     public static void categorise(ArrayList<String> listOfCategories, ArrayList<String> listOfWords) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> uncategorisedWords = new ArrayList<>();

        for (String word : listOfWords) {
            String longestCategory = "";
            for (String category : listOfCategories) {
                //compare length of current category with the previous one
                if (word.startsWith(category) && category.length() > longestCategory.length()) {
                    longestCategory = category;
                }
            }
            if (!longestCategory.isEmpty()) { // if this is empty, means that the current  word does not belong in a cat, so we uncategories it
                if (!map.containsKey(longestCategory)) {
                    map.put(longestCategory, new ArrayList<>());
                }
                map.get(longestCategory).add(word);
            } 
            
             else {
                uncategorisedWords.add(word);
             }
        }

        System.out.println("Categorised: ");
        for(String category : listOfCategories)
        {
            if(map.containsKey(category) == false)
            {
                System.out.println(category + ":");
            }
        }
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + String.join(", ", entry.getValue()) + ".");
        }
        
        if(uncategorisedWords.isEmpty() == false)
        {
            System.out.println("Uncategorised: ");
            System.out.println(String.join(",", uncategorisedWords) + ".");
        }

        System.out.println("Done");
       
    
       
    }
}