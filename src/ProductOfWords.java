/*Given a string array words, return the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. If no such two words exist, return 0.

 

Example 1:

Input: words = ["abcw","baz","foo","bar","xtfn","abcdef"]
Output: 16
Explanation: The two words can be "abcw", "xtfn". */

import java.io.*;
import java.util.*;

public class ProductOfWords {
    public static void main(String[] args) {
        String [] words = {"a","aa","aaa","aaaa"};
        System.out.println(maxProduct(words));
    }

    public static int maxProduct(String[] words) {
       
        int max = 0;
        for(int i = 0; i<words.length; i++)
        {
            String current = words[i];
            int lengthOfCurrent = current.length();

            for(int j = i + 1; j<words.length; j++)
            {
                String others = words[j];
                int lengthOfOthers = others.length();
                
                boolean duplicate = false;
                for(int k = 0; k<current.length(); k++)
                {
                    for(int m = 0; m<others.length(); m++)
                    {
                        if(current.charAt(k) == others.charAt(m))
                        {
                            duplicate = true;
                            break;
                        }
                    }
                }

                if(duplicate == false)
                {
                    max = Math.max(max, lengthOfCurrent * lengthOfOthers);
                }
            }
        }

        return max;
    }
}
