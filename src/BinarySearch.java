public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = new int[10000000];
        for(int i = 1; i< arr.length; i++)
        {
            arr[i] = i;
        }
      
        System.out.println(binarySearch(arr, 9));
    }

    public static int binarySearch(int [] array, int target)
    {
        int low = 0;
        int high = array.length - 1;

       

        while(low <= high)
        {
            int middleIndex = (low + high) / 2;
            if(target == array[middleIndex])
            {
                return middleIndex;
            }

            if(target < array[middleIndex])
            {
                high = middleIndex - 1;
            }

            else
            {
                low = middleIndex + 1;
            }
        }

        return -1;
    }
}
