import java.io.*;
import java.util.*;
public class Perimeters {
   
   static int row;
   static int col;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int starT_i = sc.nextInt();
        int starT_j = sc.nextInt();

         row = sc.nextInt();
         col = sc.nextInt();

        int [][] matrix = new int[row][col];
        for(int i = 0; i<row; i++)
        {
            for(int j = 0; j<col; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close();

        System.out.println(CalculatePerimeter(matrix, row, col));
    }

    public static int CalculatePerimeter(int [][] matrix, int row, int col)
    {
        int total = 0;
        for(int i = 0; i<row; i++)
        {
            for(int j = 0; j<col; j++)
            {
                if(matrix[i][j] == 1)
                {
                    total = total + ( 4 - (findNeigh(matrix, i, j)));
                }
            }
        }
        return total;
    }

    public static int findNeigh(int [][] matrix, int i, int j)
    {
        //method to find contribution of each 1 to the permiter

        int count = 0;

        //UP
        if(i > 0 && matrix[i - 1][j] == 1)
        {
            count++;
        }
        //left
        if(j > 0 && matrix[i][j-1] == 1)
        {
            count++;
        }
        //down
        if(i < row - 1 && matrix[i + 1][j] == 1)
        {
            count++;
        }
        //right
        if(j < col - 1 && matrix[i][j+1] == 1)
        {
            count++;
        }

        return count;
    }
}
