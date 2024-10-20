//A java program that returns the number of prime numbers that re striclty less than 10
import java.io.*;
import java.util.*;


public class CountPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");

        int n = sc.nextInt();
        // The approach here is very simple, the idea is to have a boolean method that checks if num is a prime number
        //Secondly is to have a method that takes in an array, calls the primechecking method for each element in the array

        int [] array = new int[n];
        for(int k = 0; k<n; k++)
        {
            array[k] = k;
        }

        int myCount = countPrimes(array);
        System.out.println(myCount);


    
    }

    public static boolean isPrime(int num) //method for checking if a single num is a prime
    {
        if(num == 1 || num == 0)
        {
            return false;
        }

        for(int i = 2; i<=Math.sqrt(num); i++)  // a number can only be divisble until its sqrt
        {
            if(num%i == 0) // this means this num is divisble by another number, therefore not a prime
            {
                return false;
            }
        }


    return true;

    }

    public static int countPrimes(int [] arr) //this method takes in an array as input, an calculattes the number of prime numbers
    {
        // we firstly need to loop through the array, and call the isPrime method on every element
        int count = 0;
        for (int element : arr) {
            if(isPrime(element))
            {
                count++;
            }
           
        }
        return count;
    }


}
   
          