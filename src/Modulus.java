import java.util.*;
import java.io.*;

public class Modulus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N ;
        int Z;

        while(true)
        {
            N = sc.nextInt();
            Z = sc.nextInt();

            break;
        }
        if(N == 0 || N > 1000 || Z >= N || Z == 0)
        {
            System.out.println(0);
            System.out.println();
            return;
        }
        //System.out.println("N is " + N);
        //System.out.println("Z is " + Z);


        int pairs = 0;
        for(int i = 1; i < N; i++)
        {
            for(int j = 0; j< N; j++)
            {
                
                    if((i*j) % N == Z)
                    {
                        pairs++;
                        //System.out.println("Pair " + pairs + " is " + i + " , " + j);
                        
                    }
                
            }
        }
        System.out.println(pairs);
        System.out.println();
    }
}
