import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Majory {
    public static void main(String[] args) {
        Majory maj = new Majory();
        int [] array = {3, 3, 4};
        //HashMap<Integer, Integer> Mymap = new HashMap<>();

     //   Mymap = maj.majorityElement(array);
        
        //System.out.println(Mymap);

    }
    public int  majorityElement(int[] nums) {
        /*Given an array nums of size n, return the majority element.

        The majority element is the element that appears more than ⌊n / 2⌋ times. 
        You may assume that the majority element always exists in the array. 
        
        
        Input: nums = [3,2,3]
        Output: 3
        
        */

        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;
        int index = 0;

        while(index < nums.length)
        {
            int key = nums[index];
            if(map.containsKey(key))
            {
                map.put(key, map.get(key) + 1  );
                count++;
            }
            else{
                map.put(key, 1);
            }
            index++;

        }

        //return map;

       int num = 0;

        for(Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            if(entry.getValue() > n/2)
            {
                num = entry.getKey();
            }
        }

        return num;  

        
            
    }   
        
 }

