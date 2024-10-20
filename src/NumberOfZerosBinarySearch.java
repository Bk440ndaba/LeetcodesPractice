import java.io.*;
import java.util.*;

public class NumberOfZerosBinarySearch {
    public static void main(String[] args) {
        int [] array = {1, 1, 1, 1, 0, 0};
        System.out.println(getNumZeros(array));
       
    }
    public static int getNumZeros(int [] arr)
    {
        int firstOcc = firstOcc(arr); 
        if(firstOcc == -1)
        {
            return -1;
        }

        return arr.length - firstOcc;
    }

    public static int firstOcc(int [] array)
    {
        int index = -1;

        int low = 0;
        int high = array.length - 1;

        while(low <= high)
        {
            int mid = (low + high)/2;

            if(array[mid] == 0)
            {
                index = mid;
                high = mid - 1;
            }
            if(array[mid] > 0)
            {
                low = mid + 1;
            }
        }
        return index;

    }
}
