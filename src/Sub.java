import java.util.ArrayList;

public class Sub {
    public static void main(String[] args) {
        Sub obj = new Sub();
        String s = "acb";
        String t = "ahbgdc";
        //System.out.println("he;;o");
        //String anseString = obj.isSubsequence(s, t);
       // System.out.println(anseString);
        //System.out.println("he;;o");
        boolean fin = obj.isSubsequence(s, t);
        System.out.println(fin);
        }

    public boolean isSubsequence(String s, String t) {
        
        /*  Input: s = "abc", t = "ahbgdc"
            Output: true */
        
        String answer = "";
        int Sindex = 0;
        int Tindex = 0;
        
        while(Sindex < s.length() && Tindex < t.length())
        {
            if(String.valueOf(s.charAt(Sindex)).equals(String.valueOf(t.charAt(Tindex)))) // if a character in s matcher one in t, increment both indexes
            {
                Sindex++;
                Tindex++;
            }

            else{ // Only increment Tindex
                Tindex++;
            }
        }

        if(Sindex == s.length())
        {
            return true;
        }

        else
        {
            return false;
        }

         
        
        
        
    }
}
