import java.util.*;

public class InvalidTransaction {
    public static void main(String[] args) {
        InvalidTransaction iv = new InvalidTransaction();
        String [] transactions = {"alice,20,1220,mtv","alice,20,1220,mtv"};
        iv.invalidTransactions(transactions);
    }
    public ArrayList<String> invalidTransactions(String[] transactions) {
        /*  Input: transactions = ["alice,20,800,mtv","alice,50,100,beijing"]
            Output: ["alice,20,800,mtv","alice,50,100,beijing"]    */
            
         ArrayList<String> list = new ArrayList<>();
        
        if(transactions.length > 1)
        {
            for(int i = 0; i<transactions.length; i++)
            {
                
                String [] transactI = transactions[i].split(",");
                String nameI = transactI[0];
               int amount = Integer.parseInt(transactI[2]);
                int timeI = Integer.parseInt(transactI[1]);
                String cityI = transactI[3];

                if(amount > 1000)
                {
                    list.add(transactions[i]);
                    continue;
                }

               

                for(int j = 0; j<transactions.length; j++)
                {

                    String [] transactJ = transactions[j].split(",");
                    String nameJ = transactJ[0];
                    int timeJ = Integer.parseInt(transactJ[1]);
                    String cityJ = transactJ[3];
                    
                    if(i == j)
                    {
                        continue;
                    }

                    if(Math.abs(timeI - timeJ) <= 60 && nameI.equals(nameJ) && !cityI.equals(cityJ))
                    {
                        
                        list.add(transactions[i]);
                         break;
                    }

                }
            }
        }

       return list;

    }
}
