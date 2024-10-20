import java.util.ArrayList;
import java.util.List;

public class DesiredSumSliding {
    public static void main(String[] args) {
        DesiredSumSliding dd = new DesiredSumSliding();
        int [] array = {1, 7, 9, 4, 3, 2, 2};
        List<List<Integer>> myReList = dd.getSubArray(array, 7);
        System.out.println(myReList);
    }
    public List<List<Integer>> getSubArray(int array[], int desiredSum)
    {
        int sum = 0;
        int RemoveIndex = 0;
        List<List<Integer>> results = new ArrayList<>();


        for(int i = 0; i<array.length; i++)
        {
            sum = sum + array[i];

            while(sum > desiredSum) // shrink the window
            {
                sum = sum - array[RemoveIndex]; /// by removing elements at the begginning
                RemoveIndex++;
            }

            if(sum == desiredSum)
            {
                List<Integer> subArray = new ArrayList<>();
                for(int j = RemoveIndex; j<= i; j++) // add all the elements starting from remove index till the current one
                {
                    subArray.add(array[j]);
                }

                results.add(new ArrayList<>(subArray));
            }
        }

        return results;
    }
}
