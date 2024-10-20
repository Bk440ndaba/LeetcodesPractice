import java.util.*;
import java.io.*;

public class PeakBruteForce {
    public static void main(String[] args) {
        int [] arr = {5, 10, 20, 15};
        System.out.println(peak(arr));
    }

    public static int peak(int [] array)
    {   
        int element = 0;
        for(int i = 1; i<array.length - 1; i++)
        {
            int current = array[i];
            int prev = array[i-1];
            int next = array[i+1];
            if(current >= prev && current >= next)
            {
                element = current;
                break;
            }
        }

        return element;
    }
}
