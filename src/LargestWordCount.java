import java.util.*;

import javax.sound.midi.SysexMessage;

import java.io.*;

public class LargestWordCount {
    public static void main(String[] args) {
        LargestWordCount lc = new LargestWordCount();
        String [] message = {"How is leetcode for everyone","Leetcode is useful for practice"};
        String [] sender = {"Bob","Charlie"};
        String resString = lc.largestWordCount(message, sender);
        
        System.out.println(resString);
      
       
    

    }
    public String largestWordCount(String[] messages, String[] senders) {
        
        HashMap<String, Integer> map = new HashMap<>();

        String s = "";
        for(int l = 0; l<messages.length; l++)
        {
            s = messages[l];
            String [] array = s.split(" ");
            int length = array.length;
            if(map.containsKey(senders[l]))
            {
                map.put(senders[l], map.get(senders[l]) + length);
            }
            else
            {
                map.put(senders[l], length);
            }
          
        }

       // System.out.println(map);
        int max = 0;
        for(Map.Entry<String, Integer> entry : map.entrySet())
        {
            max = Math.max(max, entry.getValue());
        }

        ArrayList<String> list = new ArrayList<>();
       
        for(Map.Entry<String, Integer> entry : map.entrySet())
        {
            if(entry.getValue() == max)
            {
                list.add(entry.getKey());
            }
        }

        Collections.sort(list);
        return list.get(list.size()-1);

        
       

      
      
        

        



    }
}
