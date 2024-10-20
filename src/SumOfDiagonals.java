import java.util.*;

public class SumOfDiagonals {
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

        int leftsum = 0;
        int rightsum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<columns; j++)
            {
               if(i == j)
               {
                    list.add(matrix[i][j]);
                    leftsum = leftsum + matrix[i][j];
               }
               if((i + j) == (rows - 1))
               {
                rightsum += matrix[i][j];
                list2.add(matrix[i][j]);
               }
            }
        }

        int max = Math.max(leftsum, rightsum);

        System.out.println("Numbers on left diagonal are " + list + " and their sum is " + leftsum);
        System.out.println("Numbers on right diagonal are " + list2 + " and their sum is " + rightsum);

    }
}
