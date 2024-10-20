public class MaxSubArray {
    public static void main(String[] args) {
        MaxSubArray mx = new MaxSubArray();


        int [] ray = {3, 10, 5,17,11,20, 2, 4};

        int result = mx.getSubArray(ray, 3);
        System.out.println(result);
    }
    public int getSubArray(int [] array , int size)
    {
        /// Given an array, find the maximum subarray of size k
        int currentSum = 0;
        int maxSum = 0;

        for(int i = 0; i<size; i++) // sum of the first window
        {
            currentSum = currentSum + array[i];
        }

        maxSum = currentSum;
        for(int i = size; i<array.length; i++)
        {
            currentSum = currentSum + array[i] - array[i - size];

            maxSum = Math.max(maxSum, currentSum);
            
        }

        return maxSum;
    }
}
