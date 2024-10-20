import java.util.ArrayList;
import java.util.List;


public class DesiredSumBrute {
    public static void main(String[] args) {
        DesiredSumBrute ds = new DesiredSumBrute();
        int [] array = {1, 7, 4, 3, 1, 2, 1, 5, 1};
        int sum = 7;
        List<List<Integer>> result = new ArrayList<>();
        result = ds.subarray(array, sum);
        System.out.println(result);

    }
    public List<List<Integer>> subarray(int array[], int k)
    {
       List<List<Integer>> reList = new ArrayList<>();

       for(int start = 0; start<array.length; start++)
       {
        int sum = 0; 
        List<Integer> subArray = new ArrayList<>();

            for(int end = start; end <array.length; end++)
            {
               // sum = sum + array[end];
               subArray.add(array[end]);
               sum = sum + array[end];

               if(sum == k)
               {
                reList.add(new ArrayList<>(subArray));
               }

            }
       }
       return reList;
    }
}
