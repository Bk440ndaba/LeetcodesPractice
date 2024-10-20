import java.io.*;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 50;
        
        long start = System.currentTimeMillis();
        int results = fib(n);
        long end = System.currentTimeMillis();

        System.out.println("Results are: " + results + " and time taken is: " + (end - start));
    }

    public static int fib(int n)
    {
        if(n == 0)
        {
            return 0;
        }

        if(n == 1)
        {
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }
}
