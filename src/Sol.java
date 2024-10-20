import java.util.Arrays;

public class Sol {

    public static void main(String[] args) {
        Sol s = new Sol();
        //String [] ray = {"flower", "flow", "flight"};
        //String [] ray = {"flower", "flow", "flight"};
        String [] ray = {"reflower", "flow", "flight"};

        String answer = s.longestCommonPrefix(ray);
        System.out.println(answer);
    }

    public String longestCommonPrefix(String[] strs) {
        
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
            String subString = "";
            String empty = "";
            /*for(int k = 0; k<strs.length -1; k++)
            {
                String firstword = strs[k];
                String secondword = strs[k+1];

                 while(index < firstword.length() && index < secondword.length())
                 {
                    if(firstword.charAt(i) == secondword.charAt(i))
                    {
                        i++;
                    
                    }
                    
                    else{
                        return empty;
                    }

                    index++;
                }

                 subString = firstword.substring(0, i);

            }

         
         
           // String firstword = strs[0];
            //String secondword = strs[1];

            //int index = 0;
            //int i = 0; 
           // while(index < firstword.length() && index < secondword.length())
            //{
             //   if(firstword.charAt(i) == secondword.charAt(i))
             //   {
                //    i++;
                    
              //  }
              //  index++;
           // }

            //String subString = firstword.substring(0, i);
            return subString;

            */
            String firstWord = "";
            for(int k = 0; k<strs.length; k++)
            {
                for(int m = k+1; m<strs.length; m++)
                {
                     firstWord = strs[k];
                    String secondWord = strs[m];

                    while(index < firstWord.length() && index < secondWord.length())
                    {
                        if(firstWord.charAt(i) == secondWord.charAt(i))
                        {
                            i++;
                        }

                        index++;
                    }
                }

            }
            subString = firstWord.substring(0, i);
            return subString;

         
    }
    
}
