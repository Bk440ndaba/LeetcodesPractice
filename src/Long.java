import java.util.Arrays;

public class Long {
    public static void main(String[] args) {
        Long s = new Long();
        //String [] ray = {"flower", "flow", "flight"};
        //String [] ray = {"flower", "flow", "flight"};
      String [] ray = {"reflower", "flow", "flight"};

        String answer = s.longestCommonPrefix(ray);
        System.out.println(answer);

        
    }

    public String longestCommonPrefix(String[] strs)
    {
         /*
         * Input: strs = ["reflower","flow","flight"]
            Output: "fl"
         */
        String answer = "";
            if(strs.length == 0)
            {
                return answer;
            }
            if(strs.length == 1)
            {
                return strs[0];
            }

           Arrays.sort(strs);
         
            int index = 0;
            int i = 0;
            
            String empty = "";

              String firstword = strs[0];
              String secondword = strs[strs.length -1];
            

            //int index = 0;
            //int i = 0; 
            while(index < firstword.length() && index < secondword.length())
            {
               if(firstword.charAt(i) == secondword.charAt(i))
                {
                    i++;
                    
                }
                else
                {
                    break;
                }
                index++;
            
            }

            String subString = firstword.substring(0, i);
            return subString;
    }
}
