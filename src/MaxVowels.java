public class MaxVowels {
    public int maxVowels(String s, int k) {
        
        String prevString = "";
        for(int i = 0; i<k; i++)
        {
            prevString = prevString + String.valueOf(s.charAt(i));
        }

        int count = 0;
        int maxFirst = 0;
        for(int i = 0; i<prevString.length(); i++)
        {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
            {
                count++;
            }

            
        }
        maxFirst = Math.max(count, maxFirst);   
       // int max = maxFirst;
       int max = 0;


        for(int i = k; i<s.length(); i++)
        {      
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
                {
                    count++;
                }
                
                if(s.charAt(i -k) == 'a' || s.charAt(i-k) == 'e' || s.charAt(i-k) == 'i' || s.charAt(i-k) == 'o' || s.charAt(i-k) == 'u')
                {
                    count--;
                } 

            max = Math.max(max, count); 
            
        }

        return Math.max(max, maxFirst);
        
    }
}
