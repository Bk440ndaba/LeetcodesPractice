public class Fibo {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }

    public static int fib(int n)
    {
        if(n == 1 || n == 0)
        {
            return n;
        }

        int [] array = new int[n + 1];
        array[0] = 0; 
        array[1] = 1;
        for(int i = 2; i<=n; i++)
        {
            array[i] = array[i - 1] + array[i - 2];

        }

        return array[n];
    }
}
