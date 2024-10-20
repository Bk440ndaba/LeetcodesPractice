import java.io.*;
import java.util.*;



public class Check {
    public static void main(String[] args) {
        Scanner file = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the cards file: ");
        String filename = sc.nextLine();

        try {
            file = new Scanner( new FileInputStream(filename));
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        String line = "";
        while(file.hasNextLine())
        {
            line = file.nextLine();

            String [] array= line.split(" ");

            String cardOne = array[0];
            String cardTwo = array[1];
            String cardThree = array[2];

            String [] arrayOfCardOne = cardOne.split(",");
            String [] arrayOfCardTwo = cardTwo.split(",");
            String [] arrayOfCardThree = cardThree.split(",");

            String cardOneShape = arrayOfCardOne[0];
            String cardOneColour = arrayOfCardOne[1];
            String cardOnePattern = arrayOfCardOne[2];

            String cardTwoShape = arrayOfCardTwo[0];
            String cardTwoColour = arrayOfCardTwo[1];
            String cardTwoPattern = arrayOfCardTwo[2];

            String cardThreeShape = arrayOfCardThree[0];
            String cardThreeColour = arrayOfCardThree[1];
            String cardThreePattern = arrayOfCardThree[2];

            System.out.println("Processing: " + line);

            
            if((checkShape(cardOneShape, cardTwoShape, cardThreeShape) && checkColour(cardOneColour, cardTwoColour, cardThreeColour) && checkPattern(cardOnePattern, cardTwoPattern, cardThreePattern)) || 

    ((cardOneShape.equals(cardTwoShape) && !cardOneShape.equals(cardThreeShape)) || 
    (cardOneColour.equals(cardTwoColour) && !cardOneColour.equals(cardThreeColour)) || 
    (cardOnePattern.equals(cardTwoPattern) && !cardOnePattern.equals(cardThreePattern))) &&

    (cardOneShape.equals(cardThreeShape) || cardOneColour.equals(cardThreeColour) || cardOnePattern.equals(cardThreePattern)) &&

    (cardTwoShape.equals(cardThreeShape) || cardTwoColour.equals(cardThreeColour) || cardTwoPattern.equals(cardThreePattern)))
                 {
                    System.out.println("Valid");
                 }
            else
            {
                System.out.println("Invalid");
            }


        }

        System.out.println("Done");
    }

    public static boolean checkShape(String c1, String c2, String c3)
    {
        if(c1.equals(c2) && c1.equals(c3) && c2.equals(c3) || c1.equals(c2) == false && c1.equals(c3) == false && c2.equals(c3) == false)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean checkColour(String c1, String c2, String c3)
    {
        if(c1.equals(c2) && c1.equals(c3) && c2.equals(c3) || c1.equals(c2) == false && c1.equals(c3) == false && c2.equals(c3) == false)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean checkPattern(String c1, String c2, String c3)
    {
        if(c1.equals(c2) && c1.equals(c3) && c2.equals(c3) || c1.equals(c2) == false && c1.equals(c3) == false && c2.equals(c3) == false)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    
}
