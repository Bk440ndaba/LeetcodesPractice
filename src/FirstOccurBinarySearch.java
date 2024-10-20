import java.util.*;
import java.io.*;

public class FirstOccurBinarySearch {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 3, 3, 3, 10};
        int x = 3;

        int firstOcc = firstOccur(array, 3);
        int lastOcc = lastOccur(array, 3);

        System.out.println("The first occurance of " + x + " in array " + Arrays.toString(array) + " is at position " + firstOcc);
        System.out.println("The last occurance of " + x + " in array " + Arrays.toString(array) + " is at position " + lastOcc);

    }

    public static int firstOccur(int [] array, int x)
    {
        int result = -1;
        int low = 0;
        int high = array.length - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(x == array[mid])
            {
                result = mid;
                high = mid - 1;

            }
            if(x > array[mid])
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        return result;

    }

    public static int lastOccur(int [] array, int x)
    {
        int result = -1;
        int low = 0;
        int high = array.length - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(x == array[mid])
            {
                result = mid;
                low = mid + 1;

            }
            if(x >= array[mid])
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        return result;
    }
}
