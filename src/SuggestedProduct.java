import java.util.*;

public class SuggestedProduct {
    public static void main(String[] args) {
        SuggestedProduct sp = new SuggestedProduct();
        String searchWord = "havana";
        String [] products = {"havana"};
        sp.suggestedProducts(products, searchWord);
    }
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        /*  Input: products = ["mobile","mouse","moneypot","monitor","mousepad"], searchWord = "mouse"
            Output: [["mobile","moneypot","monitor"],["mobile","moneypot","monitor"],["mouse","mousepad"],["mouse","mousepad"],["mouse","mousepad"]] */

        Arrays.sort(products);
        List<List<String>> container = new ArrayList();
        
        String prefix = "";

        for(int i = 0; i<searchWord.length(); i++)
        {
            prefix = prefix + searchWord.charAt(i);

            List<String> list = new ArrayList();
            for(int j = 0; j<products.length; j++)
            {
                if(products[j].startsWith(prefix))
                {
                   
                    if(list.size() <= 2)
                    {
                        list.add(products[j]);
                    }
                }
                
            }
            container.add(list);
        }

        return container;

        
    }

}
