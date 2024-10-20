import java.util.*;
import java.io.*;

public class MajorityDivideAndConquer {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 3, 3, 3, 10};
        int x = 3;
        System.out.println(majority(array, x));
        
    }

    public static boolean majority(int [] array, int x)
    {
        int firstOcc = firstOccur(array, x);
        int lastOcc = lastOccur(array, x);
        int counter = 0;

        for(int i = firstOcc; i<=lastOcc; i++)
        {
            if(array[i] == x)
            {
                counter++;
                if(counter > array.length / 2)
                {
                    return true;
                }
                
            }
        }
        
        return false;
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
