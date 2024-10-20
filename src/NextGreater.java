import java.util.ArrayList;

public class NextGreater {
    public static void main(String[] args) {
        NextGreater ng = new NextGreater();
        int [] nums1 = {4, 1, 2};
        int [] nums2 = {1, 3, 4, 2,};
        ArrayList<Integer> results = ng.nextGreaterElement(nums1, nums2);
        System.out.println(results);

    }
    public ArrayList<Integer> nextGreaterElement(int[] nums1, int[] nums2) {
        /*  Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
            Output: [-1,3,-1]    */

        ArrayList<Integer> list = new ArrayList<>();
       
        for(int i = 0; i<nums1.length; i++)
        {
            boolean found = false;
            for(int j = 0; j<nums2.length; j++)
            {
                if(nums1[i] == nums2[j])  // if found
                {
                    found = true;
                }
                   
                if(found == true && nums2[j] > nums1[i])
                {
                    list.add(nums2[j]);
                    break;
                }

                if(found == false || i >= )
            }
        }
       /*  int [] array = new int[list.size()];
        int i = 0;
        for (Integer ele : list) {
            array[i] = ele;
            i++;
        }
        return array;

        */

        return list;
        
    }
}
