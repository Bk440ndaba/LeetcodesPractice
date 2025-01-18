import java.util.*;

public class Products {
    public static void main(String[] args) {
       String s = "mouse";
      String [] products = {"mobile","mouse","moneypot","monitor","mousepad"};
      suggestedProducts(products, s);
    }
    public static void suggestedProducts(String [] products,  String searchWord) {
        /*  Input: products = ["mobile","mouse","moneypot","monitor","mousepad"], searchWord = "mouse"
            Output: [["mobile","moneypot","monitor"],["mobile","moneypot","monitor"],["mouse","mousepad"],["mouse","mousepad"],["mouse","mousepad"]] */
        Arrays.sort(products);
        String sub = "";
        ArrayList<ArrayList<String>> ListOflists = new ArrayList<>();
        for(int i = 0; i<searchWord.length(); i++)
        {
            sub = sub + String.valueOf(searchWord.charAt(i));
            ArrayList<String> list = new ArrayList<>();
            for(int j = 0; j<products.length; j++)
            {
                String product = products[j];
                if(product.contains(sub) && list.size() < 3)
                {
                    list.add(product);
                }
            }
        
            ListOflists.add(list);
        }

        System.out.println(ListOflists);
       

       
       

        
    }

}
