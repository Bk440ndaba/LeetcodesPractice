import java.util.Arrays;

public class MergeSorted {
    public static void main(String[] args) {
        MergeSorted ms = new MergeSorted();
        int [] nums1 =  {1};         //{1, 2, 3, 0, 0, 0};
        int [] nums2 =   {} ;         //{2,5,6};

        int [] array = new int[nums1.length];
        array = ms.merge(nums1, nums1.length, nums2, nums2.length);
        for(int i = 0; i<array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
    public int [] merge(int[] nums1, int m, int[] nums2, int n) {
        /*  Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
            Output: [1,2,2,3,5,6]  */
            int index = 0;
            for(int i = m; i<nums1.length; i++)
            {
                nums1[i] = nums2[index];
                index++;
            }

            Arrays.sort(nums1);
            return nums1;
    }
}
