import java.util.*;
import java.io.*;

public class DPFibonacci {
    static int n = 1000000;
    static int [] array = new int[n + 1];
    public static void main(String[] args) {
        for(int i = 0; i<array.length; i++)
    {
        array[i] = -1;
    }
        long start = System.currentTimeMillis();
        int res = fibo(n);
        long end = System.currentTimeMillis();

        System.out.println("Results are: " + res + " and time taken is: " + (end - start));

    }

    public static int fibo(int n)
    {
        array[0] = 0;
        array[1] = 1;

        for(int i = 2; i<= n; i++)
        {
            array[i] = array[i - 1] + array[i - 2];
        }

        return array[n];
    }
}
