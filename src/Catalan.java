import java.util.Arrays;

public class Catalan {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(catalan(n));
        //catalan(n);
    }

    public static int catalan(int n)
    {
        
         int catalan[] = new int[n + 2];
 
         // Initialize first two values in table
         catalan[0] = 1;
         catalan[1] = 1;
  
         // Fill entries in catalan[]
         // using recursive formula
         for (int i = 2; i <= n; i++) {
             catalan[i] = 0;
             for (int j = 0; j < i; j++) {
                 catalan[i]
                     += catalan[j] * catalan[i - j - 1];
             }
         }
  
         // Return last entry
         return catalan[n];

    }
}
