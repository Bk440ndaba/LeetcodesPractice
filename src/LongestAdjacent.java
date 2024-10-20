import java.lang.Math;
import java.util.*;

class LongestAdjacent {

    static int longestSubsequence(int n, int arr[])
    {
        if (n == 1)
            return 1;
        Integer dp[] = new Integer[n];
        HashMap<Integer, Integer> mapp = new HashMap<>();
        dp[0] = 1;
        mapp.put(arr[0], 0);
        for (int i = 1; i < n; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) == 1)
                dp[i] = dp[i - 1] + 1;
            else {
                if (mapp.containsKey(arr[i] + 1)
                    || mapp.containsKey(arr[i] - 1)) {
                    dp[i] = 1
                            + Math.max(mapp.getOrDefault(
                                           arr[i] + 1, 0),
                                       mapp.getOrDefault(
                                           arr[i] - 1, 0));
                }
                else
                    dp[i] = 1;
            }
            mapp.put(arr[i], dp[i]);
        }
        return Collections.max(Arrays.asList(dp));
    }

    public static void main(String[] args)
    {
        // Longest subsequence with one
        // difference is
        // {1, 2, 3, 4, 3, 2}
        int arr[] = { 1, 2, 3, 4, 5, 3, 2 };
        int n = arr.length;
        System.out.println(longestSubsequence(n, arr));
    }
}

// This code is contributed by rajsanghavi9.

