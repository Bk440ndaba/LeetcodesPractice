public class CircularSentence {
    public boolean isCircularSentence(String sentence) {
        String [] array = sentence.split(" ");
        boolean flag = false;
        if(array.length == 1)
        {
            String word = array[0];
            char a = word.charAt(0);
            char b = word.charAt(word.length() - 1);
            if(a == b)
            {
                return true;
            }
        }
        
        String currentWord = "";
        String nextWord = "";
       
        for(int i = 0; i<array.length - 1; i++)
        {
            currentWord = array[i];
            nextWord = array[i+1];

            char a = currentWord.charAt(currentWord.length() - 1);
            char b = nextWord.charAt(0);

           if(a == b )
           {
                flag = true;
           }
        }

        if(flag)
        {
            flag = firstAndLast(array[0], array[array.length -1]);
        }

        return flag;

       
    }

    public static boolean firstAndLast(String firstword, String lastword)
    {
        char a = firstword.charAt(0); 
        char b = lastword.charAt(lastword.length() - 1);

        return a == b;
    }
}
