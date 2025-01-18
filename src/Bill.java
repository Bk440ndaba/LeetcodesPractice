import java.util.*;
import java.io.*;

public class Bill {
    public static void main(String[] args) {
        Scanner file = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the products file: ");

        String filename = sc.nextLine();

        System.out.println("Enter the shopping list: ");

        String list = sc.nextLine();

        String [] myList = list.split(" ");

        try {
            file = new Scanner( new FileInputStream(filename));
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        HashMap<String, Double> map = new HashMap<>();
        String line;
        while(file.hasNextLine())
        {
            line = file.nextLine();
            String [] arr = line.split(" ");
            double t = Double.parseDouble(arr[1]);
            double tm = Math.round(t*1000.0)/1000.0;
            map.put(arr[0], tm);
           
        }

        sc.close();
        double total = 0.0;

       for(int i = 0; i<myList.length; i++)
       {
            if(map.containsKey(myList[i]))
            {
                System.out.println(myList[i] + " : " + map.get(myList[i]));
                total = total + map.get(myList[i]);
            }
       }

        double tt = Math.round(total*10.0)/10.0;
       System.out.println("TOTAL : " + tt);

       
       

    }
}
