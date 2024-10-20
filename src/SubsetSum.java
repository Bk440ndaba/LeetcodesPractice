// Java Program for Space Optimized Dynamic Programming
// Solution to Subset Sum Problem

import java.util.*;

public class SubsetSum {

    // Returns true if there is a subset of set[]
    // with sum equal to given sum
    static boolean isSubsetSum(ArrayList<Integer> arr, int sum) {
        int n = arr.size();
        // vector to store the current state and previous state
        boolean[] prev = new boolean[sum + 1];
        boolean[] curr = new boolean[sum + 1];

        // Mark prev[0] = true as it is true to make sum = 0
        // using 0 elements
        prev[0] = true;

        // Fill the subset table in bottom up manner
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j < arr.get(i - 1))
                    curr[j] = prev[j];
                else
                    curr[j] = (prev[j] || prev[j - arr.get(i - 1)]);
            }
            prev = curr.clone();
        }
        return prev[sum];
    }

    // Driver code
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 34, 4, 12, 5, 2));
        int sum = 9;
        if (isSubsetSum(arr, sum))
            System.out.println("Found a subset with given sum");
        else
            System.out.println("No subset with given sum");
    }
}

