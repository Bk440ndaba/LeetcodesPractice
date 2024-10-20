import java.util.*;
public class Election {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Independent Electoral Commission");
        System.out.println("--------------------------------");
        System.out.println("Enter the names of the parties (terminated by DONE)");
        HashMap<String, Integer> map = new HashMap<>();

        while(true)
        {
            String names = sc.nextLine();
            if(names.equals("DONE"))
            {
                break;
            }

            if(map.containsKey(names))
            {
                map.put(names, map.get(names) + 1);
            }
            else
            {
                map.put(names, 1);
            }
        }

        System.out.println("Vote counts: ");
        for(Map.Entry<String, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " -    " + entry.getValue());
        }




    }
}
