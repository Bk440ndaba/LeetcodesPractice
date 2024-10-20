import java.util.*;
public class LongestPalSub {
    public static void main(String[] args) {
        LongestPalSub ls = new LongestPalSub();
        String s = "cbbd";
        ArrayList<String> reList = ls.longestPalindrome(s);
        System.out.println(reList);
    }
    public String longestPalindrome(String s) {
        
        /*  Input: s = "babad"
            Output: "bab"    */

        ArrayList<String> list = new ArrayList<>();
        

        
        String sub = "";
        String longestSub = "";
        
        
        
        for(int i = 0; i<s.length(); i++)
        {
            
           for(int j = i ; j<s.length(); j++)
           {
                sub = sub + s.charAt(j);
                if(isPalindrome(sub))
                {
                    if(sub.length() > longestSub.length())
                    {
                        longestSub = sub;
                    }
                }
           }
           sub = ""; // reset sub;
        
        }

       /*  String result = "";
        for(int i = 0; i<list.size(); i++)
        {
            String subString = list.get(i);
            if(subString.length() > result.length())
            {
                result = subString;
            }
        }
        */

        
        return longestSub;
        
        
    }

    public boolean isPalindrome(String s)
    {
        int left = 0;
        int right = s.length() - 1;

        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            else
            {
                left++;
                right--;
            }
        }
        return true;
        

    }
}
