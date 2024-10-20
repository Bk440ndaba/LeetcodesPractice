import java.util.HashMap;

public class Maps {
    
    public boolean isIsomorphic(String s, String t) {
        
        /*Input: s = "egg", t = "add"
            Output: true */

            HashMap<Character, Character> hashOfS = new HashMap<>();
            HashMap<Character, Character> hashOfT = new HashMap<>();

            int indexOfS = 0;
            int indexOfT = 0;

            while(indexOfS < s.length() && indexOfT < t.length())
            {
                if(hashOfS.containsKey(s.charAt(indexOfS)) && hashOfS.get(s.charAt(indexOfS)) != t.charAt(indexOfT) || 
                    hashOfT.containsKey(t.charAt(indexOfT)) && hashOfT.get(t.charAt(indexOfT)) != s.charAt(indexOfS))
                    {
                        return false;
                    }
                    
                    hashOfS.put(s.charAt(indexOfS), t.charAt(indexOfT));
                    hashOfS.put(t.charAt(indexOfT), s.charAt(indexOfS));


                    indexOfS++;
                    indexOfT++;
                
            }

            return true;

    }

}
