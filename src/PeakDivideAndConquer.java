import java.util.*;
import java.io.*;

public class PeakDivideAndConquer {
    public static void main(String[] args) {
        int [] array = {10, 13, 15, 17, 23, 100, 90};
        System.out.println(peak(array));
    }

    public static int peak(int [] array)
    {
        int low = 0;
        int high = array.length - 1;
        

        while(low <= high)
        {
            int mid = (low + high) / 2;

            int prev = array[mid - 1];
            int next = array[mid + 1];
            int current = array[mid];

            if(current >= prev && current >= next)
            {
                return current;
            }
            
            if(next > current)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return -1;
    }
}
