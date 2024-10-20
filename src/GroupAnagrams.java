import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        GroupAnagrams gp = new GroupAnagrams();
        List<List<String>> list = new ArrayList<>();
        String [] array = {"eat","tea", "tan", "ate", "nat", "bat"};
        list = gp.groupAnagrams(array);
        System.out.println(list);


    }
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> myhash = new HashMap<>();
        String word = "";
        for(int i = 0; i<strs.length; i++)
        {
            word = strs[i];
            char [] array = word.toCharArray();
            Arrays.sort(array);

            String sorted = new String(array);

            if(myhash.containsKey(sorted) == false)
            {
                myhash.put(sorted, new ArrayList<>());

            }
            myhash.get(sorted).add(word);


        }

        return new ArrayList<>(myhash.values());
        ArrayList<ArrayList<String>> list = new ArrayList<>(myhash.values());

    }
}
