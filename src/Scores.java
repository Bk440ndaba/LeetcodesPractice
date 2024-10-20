import java.util.ArrayList;
import java.util.Collections;

public class Scores {
    public static void main(String[] args) {
        Scores scores = new Scores();
        int [] nums = {9, 4, 1, 7};
        int k = 2;
        int answer = scores.minimumDifference(nums, k);
        System.out.println(answer);
    }
    public int minimumDifference(int[] nums, int k) {
        /*  Input: nums = [9,4,1,7], k = 2
            Output: 2
            Explanation: There are six ways to pick score(s) of two students:
            - [9,4,1,7]. The difference between the highest and lowest score is 9 - 4 = 5.
            - [9,4,1,7]. The difference between the highest and lowest score is 9 - 1 = 8.
            - [9,4,1,7]. The difference between the highest and lowest score is 9 - 7 = 2.
            - [9,4,1,7]. The difference between the highest and lowest score is 4 - 1 = 3.
            - [9,4,1,7]. The difference between the highest and lowest score is 7 - 4 = 3.
            - [9,4,1,7]. The difference between the highest and lowest score is 7 - 1 = 6.
            The minimum possible difference is 2. */

            ArrayList<Integer> list = new ArrayList<>();
            int difference = 0;
            for(int i = 0; i<nums.length; i++)
            {
                int current = nums[i];
                for(int j = i+1; j<nums.length; j++)
                {
                    int next = nums[j];

                    if(current >= next)
                    {
                        difference = current - next;
                        list.add(difference);
                    }
                }
            }
            int min = Collections.min(list);
            return min;


    }
}
