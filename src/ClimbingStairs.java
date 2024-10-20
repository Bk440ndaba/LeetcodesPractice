public class ClimbingStairs {
    public int climbStairs(int n) {
        /* Input: n = 2
            Output: 2
            Explanation: There are two ways to climb to the top.
            1. 1 step + 1 step
            2. 2 steps */

        // base case

        if(n == 0 || n == 1)
        {
            return 1;
        }

        if( n == 2)
        {
            return 2;
        }

        return climbStairs(n- 1) + climbStairs(n - 2);
    }

    
}
