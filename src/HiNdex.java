import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HiNdex {
    public static void main(String[] args) {
        HiNdex hn = new HiNdex();
        int [] array = {3, 0, 6, 1, 5};
        int [] result = new int[array.length];
        result = hn.hIndex(array);
        for(int i = 0; i<result.length; i++)
        {
            System.out.print(result[i] + " ");
        }
    }
    public int hIndex(int[] citations) {
       /*   Input: citations = [3,0,6,1,5]
            Output: 3 */
       
        Integer [] array = new Integer[citations.length]; 
        for(int i = 0; i<array.length; i++)
        {
            array[i] = citations[i];
        }

        Arrays.sort(array, Collections.reverseOrder());
        
        int h = 0;
        while(h <array.length && array[h] >= h+1)
        {
            h++;
        }

        return h;


        
        
    }
}
