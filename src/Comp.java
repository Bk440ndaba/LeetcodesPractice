import java.util.Arrays;
import java.util.Comparator;

public class Comp {
    public static void main(String[] args) {
        String [] array = {"2", "19", "3", "7", "1"};
        //String[] strings = {"banana", "apple", "orange", "grape"};
        //String [] array = {"banana", "apple", "orange", "grape"};;

        //Arrays.sort(array);
        
       

        Arrays.sort(array, new Comparator<String>() {
            
            @Override

            public int compare(String a, String b)
            {
                return b.compareTo(a);
            }
        });

        for(int i = 0; i<array.length; i++)
        {
            System.out.println(array[i] + " ");
        }
       

    }
}
