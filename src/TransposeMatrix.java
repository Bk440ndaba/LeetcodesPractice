import java.util.Random;
import java.util.*;
import java.io.*;

public class TransposeMatrix {
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

       for(int i = 0; i<columns; i++)
       {
        for(int j = 0; j<rows; j++)
        {
            System.out.print(matrix[j][i] + " ");
        }
        System.out.println();
       }
    }
}
