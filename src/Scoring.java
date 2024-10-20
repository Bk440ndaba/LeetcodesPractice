import java.util.*;
import java.io.*;

public class Scoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int target = 0;
        int score = 1;
        int maxScore = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<N + 1; i++)
        {
            int v = sc.nextInt();
            list.add(v);
            if(i == N)
            {
                target = sc.nextInt();
            }
        }
        sc.close();

        System.out.println("We have " + N + " numbers and the list is: " + list + ", and target is: " + target);
       if(N == 0 || list.isEmpty())
       {
            System.out.println(0);
            System.out.println();
            return;
       }
       if(list.size() == 1)
       {
        System.out.println(list.get(0));
        System.out.println();
        return;
       }

       for(int i = 0; i<list.size(); i++)
       {
            int adding = score + list.get(i);
            int multiply = score * list.get(i);

            if(adding > multiply && adding < target)
            {
                maxScore = adding;
            }
            else{
              // means that adding < multiply
              if(adding < target)
              {
                maxScore = adding;
              }  
            }
            if(multiply > adding && multiply < target)
            {
                maxScore = multiply;
            }
            

            score = Math.max(score, maxScore);
       }
      System.out.println(maxScore);
      System.out.println();
        
    }
}
