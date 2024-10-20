import java.io.*;
import java.util.*;

public class Population {
    public static void main(String[] args) {
        Scanner file = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String filename = sc.nextLine();

        try {
            file = new Scanner(new FileInputStream(filename));
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        int n = 0;
        int m = 0;
        int lineCount = 0;
        String line = "";
        ArrayList<String> listOfCritters = new ArrayList<>();
        ArrayList<String> listOfMatings = new ArrayList<>();

        while(file.hasNextLine())
        {
            lineCount++;
            line = file.nextLine();

            if(lineCount == 1)
            {
                n = Integer.parseInt(line);
            }
            else if(lineCount > 1 && lineCount <= n + 1)
            {
                listOfCritters.add(line);
            }
            else if(lineCount == n + 2)
            {
                m = Integer.parseInt(line);
            }
            else
            {
                listOfMatings.add(line);
            }
            
        }

        for(int i = 0; i<listOfMatings.size(); i++)
        {
            String [] arrayPerMating = listOfMatings.get(i).split(" ");
            int g1 = Integer.parseInt(arrayPerMating[0]) - 1;
            int g2 = Integer.parseInt(arrayPerMating[1]) - 1;

            String c1 = listOfCritters.get(g1);
            String c2 = listOfCritters.get(g2);

            String offspring = "";
            int j = 0;

           
                while (j < c1.length() || j < c2.length()) 
                {
                        if(j < c1.length())
                        {
                            offspring = offspring + c1.charAt(j);
                        }
                        if(j < c2.length())
                        {
                            offspring = offspring + c2.charAt(j);
                        }
                        j++;
                        if(offspring.length() == 10)
                        {
                            break;
                        }     
                }
           
            listOfCritters.add(offspring);
        }

        for(int i = 0; i<listOfCritters.size(); i++)
        {
            System.out.println("[" + listOfCritters.get(i) + "]");
        }
    }
}
