import java.io.*;
import java.util.*;


public class LongestIncreasingSubSequence {
    public static void main(String[] args) {
        Scanner file = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the ship data file: ");
        String filename = sc.nextLine();

        try {
            file = new Scanner( new FileInputStream(filename));
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        sc.close();

        String line1;
        String line2;
        int pairs = 0;
        while(file.hasNextLine())
        {
            pairs++;
            line1 = file.nextLine();
            line2 = file.nextLine();

            String [] ship1= line1.split(" "); // a1 b1 c1 x1 y1
            String [] ship2 = line2.split(" "); // a2 b2 c2 x2 y2

            double [] s1 = new double[ship1.length];
            double [] s2 = new double[ship2.length];

            for(int i = 0; i<ship1.length; i++ )
            {
                s1[i] = Double.parseDouble(ship1[i]);
            }

            for(int i = 0; i<ship2.length; i++ )
            {
                s2[i] = Double.parseDouble(ship2[i]);
            }

            double a1 = s1[0];
            double b1 = s1[1];
            double c1 = s1[2];
            double x1 = s1[3];
            double y1 = s1[4];

            double a2 = s2[0];
            double b2 = s2[1];
            double c2 = s2[2];
            double x2 = s2[3];
            double y2 = s2[4];

            //Finding the intersection point(Xi, Yi)
            double Xi = (b1*c2 - b2*c1)/(a1*b2 - a2*b1);
            double Yi = (a2 * c1 - a1*c2)/(a1*b2 - a2*b1);

            //distance from s1 to (xi, yi)
            double distFromS1Inter = Math.sqrt((Xi - x1)*(Xi - x1) + (Yi -y1)*(Yi - y1));
            double distFromS2Inter = Math.sqrt((Xi - x2)*(Xi - x2) + (Yi -y2)*(Yi - y2));

            double a = distFromS1Inter - distFromS2Inter;
            double c = distFromS2Inter - distFromS1Inter;
            double b = Math.abs(a);

           String nearest = "";
           if(b < 0.5)
           {
            nearest = "; Tied.";
           }
           else if( distFromS1Inter < distFromS2Inter)
           {
                nearest = "; Ship S1 is nearest.";
           }
           else
           {
            nearest = "; Ship S2 is nearest.";
           }
            
             System.out.println("Pair " + pairs + " :  Intersection point: (" + Math.round(Xi*10.0)/10.0 +", " + Math.round(Yi*10.0)/10.0 + ");  Ship S1's distance is " +
             Math.round(distFromS1Inter*10.0)/10.0 + "; Ship S2's distance is " + Math.round(distFromS2Inter*10.0)/10.0 + nearest );
            

           

        }
    }
}
