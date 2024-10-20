import java.util.*;
import java.io.*;

public class DiscountedPrices {
    public String discountPrices(String sentence, int discount) {
        
        String [] array = sentence.split(" ");
        for(int i = 0; i<array.length; i++)
        {
            String element = array[i];

            if(element.startsWith("$") && element.length() > 1)
            {
                String extractedPrice = sentence.substring(1);

                 // Remove any non-digit characters from the price string
                extractedPrice= extractedPrice.replaceAll("[^\\d.]", "");
                int price = Integer.parseInt(extractedPrice);

                double discountPrices = price - (price * discount / 100.00);

                String calculatedDiscount = String.valueOf(discountPrices);

                element = element.replace(element, "$" + calculatedDiscount);
                
            }
        }

        return sentence;
    }
}
