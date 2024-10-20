public class PrefSum {
    public static void main(String[] args) {
        PrefSum ps = new PrefSum();
        int [] array = {4,6,10,6, 9, 20, 100,50};

        int [] result = new int[array.length];
        result = ps.getPrefSum(array);
        for(int i = 0; i<result.length; i++)
        {
            System.out.print(result[i] + " ");
        }
    }

    public int [] getPrefSum(int inputArray[])
    {
        int [] prefixSum = new int[inputArray.length];

        prefixSum[0] = inputArray[0]; 

        for(int i = 1; i<prefixSum.length; i++)
        {
            prefixSum[i] =inputArray[i] + prefixSum[i-1];
        }

        return prefixSum;
    }
}
