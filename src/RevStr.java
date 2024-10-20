public class RevStr {
    public void reverseString(char[] s) {
        char [] array = new char[s.length];

        int j = 0;

        for(int i = s.length - 1; i>= 0; i--)
        {
            array[j] = s[i];
            //System.out.println(s[i]);
            j++;
        }

        for(int m = 0; m<array.length; m++)
        {
            s[m] = array[m];
        }
    }
}
