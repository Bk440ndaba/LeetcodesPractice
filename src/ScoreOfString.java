public class ScoreOfString {
    public int scoreOfString(String s) {
        
        if(s.equals(" "))
        {
            return 0;
        }
        if(s.length() == 1)
        {
            char [] arr = s.toCharArray();
            char a = arr[0];

            int asc = a;
            return asc;
        }

        int ascii = 0;
        for(int i = 0; i<s.length() - 1; i++)
        {
            char c = s.charAt(i);
            char d = s.charAt(i+1);

            int x = c;
            int y = d;

            int z = x - y;

            ascii = ascii + Math.abs(z);

            
        }

        return ascii;
    }
}
