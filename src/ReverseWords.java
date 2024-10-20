import java.util.ArrayList;

public class ReverseWords {
    public static void main(String[] args) {
        ReverseWords rv = new ReverseWords();
        String myString ="a good   example";
        String reStrings = "";
       reStrings = rv.reverseWords(myString);
       System.out.println(reStrings);

    }
    public String reverseWords(String s) {
        /*  Input: s = "the sky is blue"
            Output: "blue is sky the"   */

        String [] array = s.split(" ");
        int length = array.length;
       
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i<length; i++)
        {
            if(array[i].equals("") == false)
            {
                list.add(array[i]);
            }
        }

        String empty = list.get(list.size() - 1);
        StringBuilder sb = new StringBuilder();


        for(int i = list.size()-2; i>= 0; i--)
        {
           empty = empty + " " + list.get(i);

        }

        //return empty = sb.toString();
        return empty;
        
    }
}
