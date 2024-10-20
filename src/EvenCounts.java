import java.util.*;


public class EvenCounts {
    public static void main(String[] args) {
        EvenCounts ev = new EvenCounts();
        String s = "bokang";
        ev.findTheLongestSubstring(s);
    }
    public void findTheLongestSubstring(String s) {
        /*  Input: s = "eleetminicoworoep"
            Output: 13   */
            ArrayList<String> list = new ArrayList<>();
           
         
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        int max = 0;

        for(int j = 0; j<s.length(); j++)
        {
            String sub = "";
            for(int l = j; l<s.length(); l++)
            {
                sub = sub + s.charAt(l);
               
                if(sub.charAt(l -j) == 'a')
                {
                    a++;
                }
                else if(sub.charAt(l-j) == 'e')
                {
                    e++;
                }
                else if(sub.charAt(l-j) == 'i')
                {
                    i++;
                }
                else if(sub.charAt(l-j) == 'o')
                {
                    o++;
                }
                else if(sub.charAt(l-j) == 'u')
                {
                    u++;
                }

                if(a % 2 == 0 && e % 2 == 0 && i % 2 == 0 && o % 2 == 0 && u % 2 == 0)
                {
                    max = Math.max(max, sub.length());
                }

                 
               
            }
        }

        System.out.println(max);


        
    }
}
