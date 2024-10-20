import java.util.*;
import java.io.*;

public class MaximumOnesMatrix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int [][] matrix = new int[rows][columns];

        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<columns; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<rows; i++)
        {
            int counter = 0;
            for(int j = 0; j<columns; j++)
            {
                if(matrix[i][j] == 1)
                {
                    counter++;
                }
            }

            map.put(counter, i);
            max = Math.max(max, counter);
            
        }

       System.out.println("row with max 1s is: " + map.get(max));
        
    }
}
