import java.util.*;

public class SubstringPresent {
    public static void main(String[] args) {
        SubstringPresent sp = new SubstringPresent();
        String s = "leetcode";
        sp.isSubstringPresent(s);
        
    }
    public boolean isSubstringPresent(String s) {
        
        String reverse = "";

        for(int i = s.length() - 1; i>= 0; i--)
        {
            reverse =  reverse + s.charAt(i);
        }

        for(int i = 0; i<s.length(); i++)
        {
            String sub = "";
            for(int j = i ; j<s.length(); j++)
            {
               sub = sub + s.charAt(j);
                if(reverse.contains(sub) && sub.length() == 2)
                    {
                        return true;   
                    }
            }
        }

        return false;
       
    }
}
