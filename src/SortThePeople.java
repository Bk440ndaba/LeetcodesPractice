import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortThePeople {
    public static void main(String[] args) {
        SortThePeople st = new SortThePeople();
        String [] names = {"Mary","John","Emma"};
        int [] heights = {180,165,170};

        ArrayList<String> list = new ArrayList<>();
        list = st.sortPeople(names, heights);
        System.out.println(list);

    }
    public ArrayList<String> sortPeople(String[] names, int[] heights) {
        
        int i = 0;
        HashMap<Integer, String> map = new HashMap<>();
        String [] array = new String[names.length];
        ArrayList<String> list = new ArrayList<>();

        while(i < names.length && i < heights.length)
        {
            map.put(heights[i], names[i]);
            i++;
        }

        Arrays.sort(heights);
        for(int j = heights.length - 1; j >= 0; j--)
        {
            list.add(map.get(heights[j]));
        }

        for(int m = 0; m<array.length; m++)
        {
            array[m] = list.get(m);
        }

        return list;
    }
}
