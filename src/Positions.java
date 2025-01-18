/*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1] */

import java.io.*;
import java.util.*;


public class Positions {
    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        int target = 8;
    
        System.out.println(Arrays.toString(searchRange(nums, target)));
        
    }

    public static int[] searchRange(int[] nums, int target) {
        int [] r = new int[2];
        r[0] = firstPos(nums, target);
        r[1] = lastPos(nums, target); 

        return r;
    }

    public static int firstPos(int[] nums, int target)
    {
        int low = 0;
        int high = nums.length - 1;

      
        int res = -1;
        while(low <= high)
        {
            int mid = (low) + (high - low)/2;
            if(target == nums[mid])
            {
                res = mid;
                high = mid - 1;
            }
            else if(target >= nums[mid])
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
            
        }
        return res;
    }

    public static int lastPos(int[] nums, int target)
    {
        int low = 0;
        int high = nums.length - 1;

        
        int res = -1;
        while(low <= high)
        {
           int mid = (low) + (high - low)/2;
            if(target == nums[mid])
            {
                res = mid;
                low = mid + 1;
            }
            else if(target >= nums[mid])
            {
                low =  mid + 1;
            }
            else
            {
                high = mid - 1;
            }
            
        }
        return res;
    }
   
}
