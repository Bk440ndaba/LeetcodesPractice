public class TrailingZeros {
    public String removeTrailingZeros(String num) {
        /*  Input: num = "51230100"
            Output: "512301"  */
        
        if(num.charAt(num.length() - 1) != '0')
        {
            return num;
        }

        char zero = '0';
        int count = 0;
        
        for(int i = num.length() - 1; i >= 0; i--)
        {
            if(num.charAt(i) == zero)
            {
                count++;
            }
            else{
                break;
            }
        }

        String fString = num.substring(0, num.length() - count);
        return fString;
    }
}
