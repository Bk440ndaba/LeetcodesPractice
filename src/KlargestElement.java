import java.util.*;

public class KlargestElement {
    public static void main(String[] args) {
        int [] nums = {3, 2,1, 6, 5, 4};
        int k = 2; 
        System.out.println(findKthLargest(nums, k));
    }
    public static int findKthLargest(int[] nums, int k) {
        /*  Input: nums = [3,2,1,5,6,4], k = 2
            Output: 5 */
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for(Integer ele : nums)
        {
            maxHeap.add(ele);
        }

        for(int i = 0; i < k - 1; i++)
        {
            maxHeap.poll();
        }

        int largest = maxHeap.peek();
        return largest;

        
    }
}
