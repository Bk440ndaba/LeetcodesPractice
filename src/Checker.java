import java.io.*;
import java.util.*;

public class Checker {
    public static void main(String[] args) {
        Scanner file = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the products file: ");
        String filename = sc.nextLine();

        System.out.println("Enter a sequence of product codes: ");
        String c = sc.nextLine();

        try {
            file = new Scanner( new FileInputStream(filename));
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        HashMap<String, String> map = new HashMap<>();

        String line = "";
        while(file.hasNextLine())
        {
            line = file.nextLine();
            String [] lines = line.split(" ");

            String productCode = lines[0];

            String v = lines[1].substring(1);

           //ouble value = Double.parseDouble(v);
            map.put(productCode, v);
        }

        String [] codes = c.split(" ");

      //System.out.println(map);
        ArrayList<Double> list = new ArrayList<>();
        ArrayList<Double> myList = new ArrayList<>();


        for(int i = 0; i<codes.length; i++)
        {
            for(Map.Entry<String, String> entry : map.entrySet())
            {
                if(codes[i].equals(entry.getKey()))
                {
                    System.out.println(entry.getKey() + " R" + entry.getValue());
                   //ist.add(entry.getValue());
                    //List.add(entry.getValue());

                    String k = entry.getValue();
                    double val = Double.parseDouble(k);

                    list.add(val);

                    myList.add(val);
                }
            }
        }



       Collections.sort(myList);
     

      if(myList.equals(list))
      {
          System.out.println("Valid");
      }
       
       else{
         System.out.println("Invalid");
       }
       

        
    }
}
