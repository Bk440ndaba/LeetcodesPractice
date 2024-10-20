public class SuffixSum {
    public static void main(String[] args) {
        SuffixSum sf = new SuffixSum();
        int [] array = {4,6,10,6, 9, 20, 100,50};

        int [] result = new int[array.length];
        result = sf.getSuffixSum(array);
        for(int i = 0; i<result.length; i++)
        {
            System.out.print(result[i] + " ");
        }
    }

    public int [] getSuffixSum(int inptArr[])
    {
        int [] suffixSum = new int[inptArr.length];

        
        for(int i = 0; i<suffixSum.length; i++)
        {
            for(int j = i; j<suffixSum.length; j++)
            {
                suffixSum[i] = suffixSum[i] + inptArr[j];
            }
        }
        return suffixSum;
    }
}
