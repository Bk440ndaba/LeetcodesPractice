public class Popu {
    public static void main(String[] args) {
        Popu p = new Popu();
        String s = "bokangdggd";
        String t = "ndaba";
        String reString = p.getCode(s, t);
        System.out.println(reString);

    }
    public String getCode(String s, String t)
    {
        int i = 0;
        String code = "";
        StringBuilder sb = new StringBuilder();
        while(i <s.length() || i <t.length() || i < 10)
        {
           if(i < s.length()) // check if we've reached the end of s separately
           {
            code = code + s.charAt(i);
           }

           if(i < t.length()) // check if we've reached the end of t separately
           {
            code = code + t.charAt(i);
           }

           i++;
        }
       

        return code;
    }
}
