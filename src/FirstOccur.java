public class FirstOccur {
    
    public int strStr(String haystack, String needle) {
        
        /*  Input: haystack = "sadbutsad", needle = "sad"
            Output: 0
            Explanation: "sad" occurs at index 0 and 6.
            The first occurrence is at index 0, so we return 0.  */

        int indexOfHaystack = 0;
        int indexOfNeedle = 0;

        

        while(indexOfHaystack < haystack.length() && indexOfNeedle < needle.length())
        {
            if(String.valueOf(needle.charAt(indexOfNeedle)).equals(String.valueOf(haystack.charAt(indexOfHaystack))))
            {
                indexOfHaystack++;
                indexOfNeedle++;
            }
            else
            {
                indexOfHaystack++;
            }
        }

        int index = 0;

        if(indexOfNeedle == needle.length())
        {
            return index = haystack.indexOf(needle);
            
        }
        else{
            return -1;
        }
        

    }
}
