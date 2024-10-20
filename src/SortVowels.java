import java.util.*;
public class SortVowels {
    public static void main(String[] args) {
        SortVowels sv = new SortVowels();
        String s = "lYmpH";
        sv.sortVowels(s);
    }
    public void sortVowels(String s) {

        ArrayList<Character>  list = new ArrayList<>();
        for(int i = 0; i<s.length(); i++)
        {
            if(isVowel(s.charAt(i)))
            {
                list.add(s.charAt(i));
            }
        }

        Collections.sort(list);
        char [] array = s.toCharArray();

        int j = 0;
        char c = ' ';

        for(int i = 0; i<array.length; i++)
        {
            c = array[i];
            if(isVowel(c))
            {
                array[i] = list.get(j);
                j++;
            }

        }

        String myString = String.valueOf(array);

        System.out.println(myString);

    }

    public static boolean isVowel(char c)
    {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
