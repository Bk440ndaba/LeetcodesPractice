import java.util.ArrayList;
import java.util.Arrays;

public class AllAnagrams {
    public static void main(String[] args) {
        AllAnagrams al = new AllAnagrams();
        String s = "aaaaaaaaaa";
        String p = "aaaaaaaaaaaaa";
        ArrayList<Integer> results = al.findAnagrams(s, p);
        System.out.println(results);
    }

    public ArrayList<Integer> findAnagrams(String s, String p) {

        ArrayList<Integer> list = new ArrayList<>();
        
        if(p.length() > s.length())
        {
            return list;
        }

        String subString = "";
        for(int i = 0; i<p.length(); i++)
        {
            subString += s.charAt(i); // substring = cba
        }

        if(isAnagram(subString, p))
        {
           list.add(0); // 
        }


    
             for(int i = p.length(); i<s.length(); i++)
             {

                subString = subString + s.charAt(i) ;// adding the current element
                String sub = subString.substring(i - p.length() + 1); // remove the char at i - p
                if(isAnagram(sub, p))
                {
                    list.add(i- p.length() + 1);
                }
            
                
            }

        


        return list;
    }

    public boolean isAnagram(String subString, String p)
    {
        char [] arrayOfP = p.toCharArray();
        char [] arrayOfSub = subString.toCharArray();

        Arrays.sort(arrayOfP);
        Arrays.sort(arrayOfSub);

        String fP = String.valueOf(arrayOfP);
        String sub = String.valueOf(arrayOfSub);

        return fP.equals(sub);
    }

   
}
