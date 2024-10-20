import java.util.*;
import java.io.*;

public class SortMatrix {
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

        System.out.println();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<columns; j++)
            {
                list.add(matrix[i][j]);
            }
        }

        Collections.sort(list);

        
        int index = 0;
         for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<columns; j++)
            {
               matrix[i][j] = list.get(index);
               index++;
            }
        }

        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<columns; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
       
    }
}
