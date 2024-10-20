import java.io.*;
import java.util.*;

public class TwoDArrays {
    public static void main(String[] args) {
        
        int rows = 4;
        int columns = 4;
        int [][] array = new int[rows][columns]; // 3*3 matrix

        int index = 1;
        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<columns; j++)
            {
                array[i][j] =  index;
                index++;
            }
        }

        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<columns; j++)
            {
               System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println();

         for(int i = 0; i<columns; i++)
        {
            int sum = 0;
            for(int j = 0; j<rows; j++)
            {
              
               sum = sum + array[j][i];
            }

            System.out.print("The sum of column " + (i + 1) + " is " + sum);
            System.out.println();
        }

        System.out.println();
        int SumOfDiagonal = 0;
        for(int i = 0; i<rows; i++)
        {
            
            for(int j = 0; j<columns; j++)
            {
              
               if((i + j) == (rows -1))
               {
                    SumOfDiagonal += array[i][j];
               }
            }

        }

        System.out.println("The sum of right diagonal is: " + SumOfDiagonal);;
        
        
    }
}
