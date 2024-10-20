import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int k = sc.nextInt();
        int [] array = new int[len];

        for(int i = 0; i<array.length; i++)
        {
            array[i] = sc.nextInt();
        }

        sc.close();
        System.out.println();

        int [] rotatedArray = new int[array.length];

        for(int i = 0; i<rotatedArray.length; i++)
        {
            int index = (i -k + len) % len;

            rotatedArray[index] = array[i];
        }

        System.out.println(Arrays.toString(rotatedArray));

    }
}
