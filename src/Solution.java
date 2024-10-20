import java.io.*;
import java.util.*;



public class Solution {

        public static void main(String[] args) {
             Solution sol = new Solution();
             int[] array = {17,18,5,4,6,1};
             //int[] array = {17};

             int [] ray = new int[array.length];
             ray = sol.replaceElements(array);
             for(int i = 0; i<array.length; i++)
             {
                System.out.println(array[i]);
             }


        }


     public int[] replaceElements_method1(int[] arr) {
        
        if(arr.length == 1)
        {
            return new int[] {-1};
        
        }

        int max = -1;

        for(int i = 0; i<arr.length -1; i++)
        {
            int currentGreat = arr[i];
            ArrayList<Integer> list = new ArrayList<>();

            for(int j = i+1; j<arr.length; j++)
            {
                list.add(arr[j]);
            }

             max = Collections.max(list);

             arr[i] = max;

           
        }

        int last = -1;
        arr[arr.length -1] = last;

        return arr;
    }

    public int[] replaceElements(int [] arr)
    {
        int maximum = -1;

        for(int i = arr.length -1; i>= 0; i--) // traversing array from top to bottom
        {
            //arr[i] = maximum; // last element to be maxmum

            if(arr[i] > maximum) // if next element if greater than current max element, update max 
            {
                int holder = maximum; // holder = -1
                maximum = arr[i]; // maximum is now 6
                arr[i] = holder; // arr[6]
            }

            else  // if next number is not greater than current max, no need to update the max
            {
                arr[i] = maximum;
            }
        }

        return arr;
    }
}