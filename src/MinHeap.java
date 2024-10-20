import java.util.*;

public class MinHeap {
    public static void main(String[] args) {
        int [] array = {10, 17, 5, 3, 7, 9, 100, 25};
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for(Integer ele : array)
        {
            minheap.add(ele);
        }

        //minheap.poll();
       // minheap.add(2);
      System.out.println(minheap);
       
       for(int i = 0; i<2; i++)
       {
        minheap.poll();
       }

       System.out.println(minheap.poll());
       

       

       
    }
}
