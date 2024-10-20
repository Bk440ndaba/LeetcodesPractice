import java.util.*;
import java.io.*;
import java.net.Inet4Address;

public class MajorityBrute {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 3, 3, 3, 10};
        int x = 3;
        System.out.println(isMajority(array, x));
    }

    public static boolean isMajority(int [] array, int x)
    {
        int counter = 0;
        for(int i = 0; i<array.length; i++)
        {
            if(array[i] == x)
            {
                counter++;
            }
        }
        if(counter > array.length/2)
        {
            return true;
        }
        return false;

        
    }
}
