import java.util.*;
import java.time.Year;

public class Occurances {
    public static void main(String[] args) {
        Occurances oc = new Occurances();
        String text = "we will we will rock you";
        String first = "we";
        String second = "will";
        oc.findOcurrences(text, first, second);
    }
    public String [] findOcurrences(String text, String first, String second) {
        
        
        
        String [] array = text.split(" ");
        if(array.length <= 2)
        {
            return new String[] {""};
        }
        
        ArrayList<String> list = new ArrayList<>();

        
        for(int i = 0; i<array.length - 2; i++)
        {
            if(array[i].equals(first) && array[i+1].equals(second))
            {
                list.add(array[i+2]);
            }

        }
         
        String [] arr = new String[list.size()];

        for(int i = 0; i<list.size(); i++)
        {
            arr[i] = list.get(i);
        }

        return arr;
       
    }
}
