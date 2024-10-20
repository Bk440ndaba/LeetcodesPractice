import java.util.*;
import java.io.*;

public class RotateMatrixKTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int k = sc.nextInt();
        
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
            int [] UnrotedRow = new int[columns];
            for(int j = 0; j<columns; j++)
            {
                UnrotedRow[j] = matrix[i][j];
            }
            
            int [] rotatedRow = new int[columns];
            for(int l = 0; l<UnrotedRow.length; l++)
            {
                int index = (l - k + columns) % rotatedRow.length;
                rotatedRow[index] = UnrotedRow[l];
            }

            for(int s = 0; s<rotatedRow.length; s++)
            {
                list.add(rotatedRow[s]);
            }
        }
        int [][] roatedMatrix = new int[rows][columns];
        int m = 0;
        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<columns; j++)
            {
                roatedMatrix[i][j] = list.get(m);
                m++;
            }
        }

       
        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<columns; j++)
            {
                System.out.print(roatedMatrix[i][j] + " ");;
            }
            System.out.println();
        }

        

       
    }
}
