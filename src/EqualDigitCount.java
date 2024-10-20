import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class EqualDigitCount {
    public boolean digitCount(String num) {
        /*  Input: num = "1210"
            Output: true  */

        if(num.length() == 1)
        {
            return false;
        }

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for(int i = 0; i<num.length(); i++)
        {
            if(map.containsKey(Integer.parseInt(String.valueOf(num.charAt(i)))))
            {
                map.put(Integer.parseInt(String.valueOf(num.charAt(i))), map.get(Integer.parseInt(String.valueOf(num.charAt(i)))) + 1);
            }
            else
            {
                map.put(Integer.parseInt(String.valueOf(num.charAt(i))), 1);
            }
        }
        int i = 1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getKey() == i)
            {
                return true;
            }
            i++;
        }
        return false;
    }
}
