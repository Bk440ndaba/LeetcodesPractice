import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class AllNUm {

    public static void main(String[] args) {
        AllNUm a = new AllNUm();
        int [] array = {4,3,2,7,8,2,3,1};
        List<Integer> myList = new ArrayList<>();
        myList = a.findDisappearedNumbers(array);
        System.out.println(myList);
        
        


    }
    
    public List<Integer> findDisappearedNumbers(int[] nums) {
        /*  Input: nums = [4,3,2,7,8,2,3,1]
            Output: [5,6] */

            int n = nums.length;
            //Arrays.sort(nums);
            List<Integer> list = new ArrayList<>();
            HashSet<Integer> set = new HashSet<>();
            int [] arr = new int[n];

            // add nums to the set
             for(int j = 0; j<n; j++)
            {
                set.add(nums[j]);
            }

            System.out.println(set);
            

            


            // now we loop through array to check if the num is present in set
            for(int i = 1 ; i<=n; i++)
            {
                if(!set.contains(i))
                {
                    list.add(i);
                }
            }

            
            /*while(index < nums.length && index < arr.length)
            {  

            } 
            */
           
           return list;

            

        
        }

        

}
