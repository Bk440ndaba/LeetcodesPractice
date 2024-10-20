import java.util.*;
import java.io.*;

public class Contribution {
    public static void main(String[] args)
    {

        Scanner file = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the data file and percentage: ");
        String filename = sc.nextLine();

        try {
            file = new Scanner(new FileInputStream(filename));

        } catch (Exception e) {
        
            e.printStackTrace();
        }

        sc.close();


        String [] getP = filename.split(" ");
        double p = Double.parseDouble(getP[1]);


        String line = "";
        double totalFsc = 0.0;
        double tfsc = 0.0;
        HashMap<String, Double> map = new HashMap<>();
        while(file.hasNextLine())
        {
            line = file.nextLine();
            
            String [] arr = line.split(" ");
            tfsc = tfsc + Double.parseDouble(arr[2]);

            
        
           
            totalFsc = Math.round(tfsc * 10)/10.0;

            String damName = arr[0];
            double fsc= Double.parseDouble(arr[2]);
            


            map.put(damName, fsc);
            

        }

        HashMap<String, Double> fmap = new HashMap<>();
        
        for(Map.Entry<String, Double> entry : map.entrySet())
        {
            double contri = (entry.getValue() * 100) / totalFsc;

            double myContri = (contri * 10)/10.0;

            fmap.put(entry.getKey(), myContri);

        }

        System.out.println("The total FSC is " + totalFsc + ".");
        System.out.println("The dams that contribute less than " + p + " percent are: ");
        for(Map.Entry<String, Double> entry : fmap.entrySet())
        {
            if(entry.getValue() < p)
            {
                
                System.out.println(entry.getKey() + " : " + Math.round((entry.getValue() * 10)) /10.0);
            }
        }

    }

    public static double getTotalFsc(String line)
    {
        String [] array = line.split(" ");
        double fscOfeach = Double.parseDouble(array[2]);

        double totalFsc = 0.0;

        totalFsc = totalFsc + fscOfeach;

        return totalFsc;
    }
}
