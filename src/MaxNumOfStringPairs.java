public class MaxNumOfStringPairs {
        public static void main(String[] args) {
            MaxNumOfStringPairs mx = new MaxNumOfStringPairs();
            String [] wordss = {"cd","ac","dc","ca","zz"};
            wordss = mx.maximumNumberOfStringPairs(wordss);
            for(int i = 0; i<wordss.length; i++)
            {
                System.out.print(wordss[i] + " ");
            }
        }

    public int maximumNumberOfStringPairs(String[] words) {
        
        /*  Input: words = ["cd","ac","dc","ca","zz"]
            Output: 2 */

       int count = 0;

        for(int i = 0; i< words.length; i++)
        {
            
            for(int j = i + 1; j<words.length; j++)
            {
                if(words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0))
                {
                    count++;
                }
            }

        }

        return count;
        
    }
}
