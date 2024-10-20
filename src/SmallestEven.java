public class SmallestEven {
    public int smallestEvenMultiple(int n) {
        /*  Input: n = 5
            Output: 10 
            
        Input: n = 6
        Output: 6

            */
        if(n == 1)
        {
            return 1;
        }
        if(n % 2 == 0)
        {
            return n;
        }
        else
        {
            return 2 * n;
        }
    }
}
