import java.util.*;
import java.io.*;

public class RotateMatrix {
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

        for(int i = rows-1; i>= 0; i--)
        {
            for(int j = columns -1; j>= 0; j--)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
            
        }
    }
}
