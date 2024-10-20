import java.util.*;
import java.io.*;

public class UniqueMatrix {
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

        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<columns; j++)
            {
                if(map.containsKey(matrix[i][j]))
                {
                    map.put(matrix[i][j], map.get(matrix[i][j]) + 1);
                }
                else
                {
                    map.put(matrix[i][j], 1);
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 1)
            {
                list.add(entry.getKey());
            }
        }

        System.out.print("Unique elements are: " + list);



    }
}
