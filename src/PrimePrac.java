import java.util.*;
import java.io.*;

public class PrimePrac {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    
       int input = sc.nextInt();
       sc.close();

       int max = -1;

       for(int i = 3; i<input; i++)
       {
            
            if(isPrime(i))
            {
                String number = String.valueOf(i);
                if(number.length() > 1)
                {
                    boolean hasZero = false;
                    for(int j = 0; j<number.length(); j++)
                    {
                        if(number.charAt(j) == '0')
                        {
                            hasZero = true;
                            break;
                        }


                    }
                    if(hasZero == false)
                    {
                        int index = number.length();
                        String sub = "";
                        int m = 1;
                        boolean lastCheck = false;
                        while(m < number.length())
                        {
                           sub = number.substring(m, number.length());
                           int num = Integer.parseInt(sub);
                           if(isPrime(num))
                           {
                                lastCheck = true;
                           }

                           m++;

                        }
                        if(lastCheck == true)
                        {
                            int myNumber = Integer.parseInt(number);
                            max = Math.max(max, myNumber);
                        }
                    }


                }
            }
       }

       System.out.println(max);

    }

    public static boolean isPrime(int n)
    {
        for(int i = 2; i<n; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
