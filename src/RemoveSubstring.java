import java.util.*;
import java.io.*;

public class RemoveSubstring {
    public static void main(String[] args) {
        RemoveSubstring rm = new RemoveSubstring();
        Scanner file = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the occurances file: ");
        String filename = sc.nextLine();

        try {
            file = new Scanner(new FileInputStream(filename));
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
        String line = "";
        while(file.hasNextLine())
        {
            line = file.nextLine();
            String [] contents = line.split(" ");
            String results = rm.removeOccurrences(contents[0], contents[1]);
            System.out.println("The strings remaining are: " + results);
        }





    }
    public String removeOccurrences(String s, String part) {
        /* Given two strings s and part, 
         perform the following operation on s until all occurrences of the substring part are removed:
        
        Input: s = "daabcbaabcbc", part = "abc"
        Output: "dab"

        */
        
        while(s.contains(part))
        {
            
        s = s.replace(part, "");
       
        }
        return s;

        
    }
}
