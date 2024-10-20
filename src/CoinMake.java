import java.util.*;
import java.io.*;

//Different ways to make a sum, count all different combinations to make a sum

public class CoinMake {
    public static void main(String[] args) {
        int [] array = { 2, 5, 3, 6};
        int x = 10;
        int N = 4;

        System.out.println(makeChange(array, N, x));
    }

    public static int makeChange(int [] array,int n,  int target)
    {
        int k = array.length;
        int [] dp = new int[target + 1];
        dp[0] = 1;

        for(int i = 0; i<k; i++)
        {
            for(int j = array[i]; j <= target; j++)
            {
                dp[j] += dp[j - array[i]];
            }
        }

        return dp[target];
        

    }
}
