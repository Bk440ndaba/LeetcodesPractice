
/*Given a string containing digits from 2-9 inclusive, 
return all possible letter combinations that the number could represent. Return the answer in any order.
 * 
 */

 import java.util.*;
 import java.io.*;

public class LetterCombo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits: ");
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> combination = new ArrayList<>();
        String dig = sc.nextLine();

        // pre-load all letter and digit into a hash map

        HashMap<String, String> myHash = new HashMap<>();
        myHash.put("1", "");
        myHash.put("2", "abc");
        myHash.put("3", "def");
        myHash.put("4", "ghi");
        myHash.put("5", "jkl");
        myHash.put("6", "mno");
        myHash.put("7", "pqrs");
        myHash.put("8", "tuv");
        myHash.put("9", "wxyz");

        

        for(Map.Entry<String, String> entry : myHash.entrySet())  // code for when length of digit is 1
        {
            if(dig.equals(entry.getKey()))
            {
                list.add(entry.getValue());
                System.out.println(list);
            }
        }

        // code for when length of digit > 1

        for(Map.Entry<String, String> entry : myHash.entrySet())
        {
            for(int i = 0 ; i<dig.length(); i++)
            {
                if(entry.getKey().equals(String.valueOf(dig.charAt(i))))
                {
                    list.add(entry.getValue());
                    
                }
            }
        }

       // System.out.println(list);

        int length = list.size();

        // code to generate the permuations
        for(int k = 0; k<length; k++)
        {
            for(int m = 0; m<length; m++)
            {
                for(int n = 0; n<length; n++)
                {
                    String combo = list.get(k) + list.get(m) + list.get(n);
                    combination.add(combo);
                }
            }
        }
        
        System.out.println(combination);
        
        
        

    }
}
