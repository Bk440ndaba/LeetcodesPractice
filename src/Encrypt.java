import java.util.Arrays;

public class Encrypt {
    public static void main(String[] args) {
        String message = "hello world";
        //mtb stb gwtbs htb 
        System.out.println(encrypt(message));
    }

    public static String encrypt(String message)
    {
        /*  Enter a message: hello world 
            Encrypted message: ifmmp xpsme  */

        String [] words = message.split(" ");
        String word = "";
       
        for(int i = 0; i<words.length; i++)
        {
            word = words[i];
            String alphabets = "abcdefghijklmnopqrstuvwxyz";
            String newWord = "";
            for(int j = 0; j<word.length(); j++)
            {
                char c = word.charAt(j);
                
                
                for(int k = 0; k<alphabets.length(); k++)
                {
                    int indexOfnewChar = 0;
                    if(word.charAt(j) == alphabets.charAt(k))
                    {
                         indexOfnewChar = (k+1) % 26;
                         c = alphabets.charAt(indexOfnewChar);
                         
                    }
                   
                }
                newWord = newWord + c;
                
                
            }
            words[i] = newWord;

        }

        String complete = "";
        for(int i = 0; i<words.length; i++)
        {
            complete += words[i] + " ";
        }
        return complete;
        
    }
}
