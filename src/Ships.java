import java.io.*;
import java.util.*;

public class Ships {
    public static void main(String[] args) {
        Scanner file = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the ship data file: ");
        String filename = sc.nextLine();

        try {
            file = new Scanner(new FileInputStream(filename));
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        String line = "";
        ArrayList<String> list = new ArrayList<>();

        while (file.hasNextLine()) 
        {
            line = file.nextLine();
            list.add(line);
        }

        String ship1 = "";
        String ship2 = "";
        
        int j = 1;
        for(int i = 0; i<list.size(); i = i + 2)
        {
            ship1 = list.get(i);
            if(i + 1 < list.size())
            {
                ship2 = list.get(i + 1);
            }

            String [] arrShip1 = ship1.split(" ");
            String [] arrShip2 = ship2.split(" ");

            double a1 = Double.parseDouble(arrShip1[0]);
            double b1 = Double.parseDouble(arrShip1[1]);
            double c1 = Double.parseDouble(arrShip1[2]);
            double x1 = Double.parseDouble(arrShip1[3]);
            double y1 = Double.parseDouble(arrShip1[4]);

            double a2 = Double.parseDouble(arrShip2[0]);
            double b2 = Double.parseDouble(arrShip2[1]);
            double c2 = Double.parseDouble(arrShip2[2]);
            double x2 = Double.parseDouble(arrShip2[3]);
            double y2 = Double.parseDouble(arrShip2[4]);

            // point of intersection
            double Xi = (b1*c2 - b2*c1) / (a1*b2 - a2*b1);
            double Yi = (a2*c1 - a1*c2) / (a1*b2 - a2*b1);

            double xi = Math.round(Xi * 10.0 ) / 10.0;
            double yi = Math.round(Yi * 10.0 ) / 10.0;


            //distance of ship1 to POI
            double Xi1 = (xi - x1) * (xi - x1);
            double Yi1 = (yi - y1) * (yi - y1);

            double disA = Math.sqrt(Xi1 + Yi1);
            double distanceA = Math.round(disA * 10.0) / 10.0;

            // distance of ship1 to POI
            double Xi2 = (xi - x2) * (xi - x2);
            double Yi2 = (yi - y2) * (yi - y2);

            double disB = Math.sqrt(Xi2 + Yi2);
            double distanceB = Math.round(disB * 10.0) / 10.0;

            // difference between the two distances
            double diff = distanceA - distanceB;
            double difference = Math.round(diff *10.0)/10.0;
            
           

            if(difference == 0.0)
            {
                System.out.println("Pair " + j + ": Intersection point: " + "(" + xi + ", " + yi + "); Ship S1's distance is " + distanceA + "; " + "Ship S2's distance is " + distanceB + "; Tied.");

            }
            if(difference > 0.0)
            {
                System.out.println("Pair " + j + ": Intersection point: " + "(" + xi + ", " + yi + "); Ship S1's distance is " + distanceA + "; " + "Ship S2's distance is " + distanceB + "; Ship S2 is nearest.");
            }
            if(difference < 0.0)
            {
                System.out.println("Pair " + j + ": Intersection point: " + "(" + xi + ", " + yi + "); Ship S1's distance is " + distanceA + "; " + "Ship S2's distance is " + distanceB + "; Ship S1 is nearest.");
            }
            
            j++;
            
            
            
        }

        System.out.println("Done");
       
        
    }
}
