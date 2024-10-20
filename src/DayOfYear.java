import java.util.*;
import java.io.*;
import java.time.Year;

public class DayOfYear {
    public static void main(String[] args) {
        DayOfYear dy = new DayOfYear();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date: ");
        String date = sc.nextLine();

        int myday = dy.dayOfYear(date);
        System.out.println(myday);

    }
    public int dayOfYear(String date) {
        /*  Input: date = "2019-01-09"
            Output: 9      */
        
        String [] dates = date.split("-");

        int year = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int day = Integer.parseInt(dates[2]);

        if(month == 1)
        {
             return day;
            
        }

        Year y = Year.of(year);
       

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 31);
        if(y.isLeap())
        {
            map.put(2, 29);
        }
        else
        {
            map.put(2, 28);
        }
        map.put(3,31);
        map.put(4,30);
        map.put(5,31);
        map.put(6,30);
        map.put(7,31);
        map.put(8,31);
        map.put(9,30);
        map.put(10,31);
        map.put(11,30);
        map.put(12,31);

        int initialTotal = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            for(int i = 1; i<month ; i++)
            {
                if(entry.getKey() == i)
                {
                    initialTotal += entry.getValue();
                }
            }
        }

        int totalDays = initialTotal + day;

        return totalDays;



    }
}
