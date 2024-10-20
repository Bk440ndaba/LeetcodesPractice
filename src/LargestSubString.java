import java.util.HashMap;

public class LargestSubString {
    public static void main(String[] args) {
        LargestSubString st = new LargestSubString();
        String s = "aa";
        int result = st.maxLengthBetweenEqualCharacters(s);
        System.out.println(result);
    }
    public int maxLengthBetweenEqualCharacters(String s) {
   
        //Given a string s, return the length of the longest substring between two equal characters, excluding the two characters. If there is no such substring return -1.
        /*  Input: s = "aa"
            Output: 0  */

        HashMap<Character, Integer> map = new HashMap<>();
        int length = 0;
        int max = -1;
        for(int i = 0; i<s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)) == true)
            {
                int currentIndex = i;
                int indexOfMapped = map.get(s.charAt(i));

                length = currentIndex - indexOfMapped - 1;
                max = Math.max(max, length);   
                
            }
            else
            {
                map.put(s.charAt(i), i);
                
            }
              
        }

        return max;
        
       
    }
}
