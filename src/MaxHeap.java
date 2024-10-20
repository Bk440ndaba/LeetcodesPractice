import java.util.*;
public class MaxHeap {
    public static void main(String[] args) {
        int [] array = {10, 17, 5, 3, 7, 9, 100, 25};
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for(int i = 0; i<array.length; i++)
        {
            maxHeap.add(array[i]);
        }

       // System.out.println(maxHeap.peek());

       while(maxHeap.isEmpty() == false)
       {
        System.out.print(maxHeap.poll() + " ");
       }
    }
}
