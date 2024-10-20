import java.io.*;
import java.util.*;

public class Cat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input file name
        System.out.println("Enter the name of the categories file:");
        String categoriesFilename = sc.nextLine();

        // Read categories from file
        ArrayList<String> categories = readCategoriesFromFile(categoriesFilename);
        if (categories == null) {
            return; // Exit if file reading fails
        }

        // Prompt user for comma-separated list of words
        System.out.println("Enter a comma-separated list of words:");
        String inputWords = sc.nextLine();
        String[] words = inputWords.split(",");

        // Categorize words
        HashMap<String, ArrayList<String>> categorizedWords = categorizeWords(words, categories);

        // Output categorized and uncategorized words
        outputCategorizedWords(categorizedWords);
    }

    // Function to read categories from file
    private static ArrayList<String> readCategoriesFromFile(String filename) {
        ArrayList<String> categories = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(new File(filename))) {
            while (fileScanner.hasNextLine()) {
                categories.add(fileScanner.nextLine().trim());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
            return null;
        }
        return categories;
    }

    // Function to categorize words
    private static HashMap<String, ArrayList<String>> categorizeWords(String[] words, ArrayList<String> categories) {
        HashMap<String, ArrayList<String>> categorizedWords = new HashMap<>();
        ArrayList<String> uncategorizedWords = new ArrayList<>();

        for (String word : words) {
            boolean categorized = false;
            for (String category : categories) {
                if (word.startsWith(category)) {
                    categorizedWords.computeIfAbsent(category, k -> new ArrayList<>()).add(word);
                    categorized = true;
                    break; // Stop checking categories if a match is found
                }
            }
            if (!categorized) {
                uncategorizedWords.add(word);
            }
        }

        // Sort categorized words
        for (ArrayList<String> categoryWords : categorizedWords.values()) {
            Collections.sort(categoryWords);
        }

        categorizedWords.put("Uncategorised", uncategorizedWords);

        return categorizedWords;
    }

    // Function to output categorized and uncategorized words
    private static void outputCategorizedWords(HashMap<String, ArrayList<String>> categorizedWords) {
        System.out.println("Categorised:");
        for (Map.Entry<String, ArrayList<String>> entry : categorizedWords.entrySet()) {
            String category = entry.getKey();
            ArrayList<String> words = entry.getValue();
            if (!words.isEmpty()) {
                System.out.println(category + ": " + String.join(", ", words) + ".");
            }
        }

        // Output uncategorized words
        ArrayList<String> uncategorizedWords = categorizedWords.get("Uncategorised");
        if (!uncategorizedWords.isEmpty()) {
            System.out.println("Uncategorised:");
            System.out.println(String.join(", ", uncategorizedWords) + ".");
        }

        System.out.println("Done");
    }
}

