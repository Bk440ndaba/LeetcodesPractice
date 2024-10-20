import java.io.*;
import java.util.*;

public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date and time (yyyy-mm-dd hh:mm): ");
        String line = sc.nextLine();

        String [] contents = line.split(" ");

        String date = contents[0];
        String time = contents[1];

        String [] arrayOfDate = date.split("-");

        String year = arrayOfDate[0].substring(2);

        String month = "";

        HashMap<String, String> map = new HashMap<>();
        map.put("01", "January");
        map.put("02", "February");
        map.put("03", "March");
        map.put("04", "April");
        map.put("05", "May");
        map.put("06", "June");
        map.put("07", "July");
        map.put("08", "August");
        map.put("09", "September");
        map.put("10", "October");
        map.put("11", "November");
        map.put("12", "December");

        for(Map.Entry<String, String> entry: map.entrySet())
        {
            if(arrayOfDate[1].equals(entry.getKey()))
            {
                month = entry.getValue();
            }
        }

        String suffix = "";
        String day = arrayOfDate[2];
        String newDay = "";

        if(day.charAt(0) == '0')
        {
            newDay = String.valueOf(day.substring(1));
            if(newDay.equals("1"))
            {
                suffix = "st";
            }
            else if(newDay.equals("2"))
            {
                suffix = "nd";
            }
            else if(newDay.equals("3"))
            {
                suffix = "rd";
            }
            else
            {
                suffix = "th";
            }
            day = newDay;
        }
        else
        {
            newDay = String.valueOf(day.substring(1));
            if(newDay.equals("1"))
            {
                suffix = "st";
            }
            else if(newDay.equals("2"))
            {
                suffix = "nd";
            }
            else if(newDay.equals("3"))
            {
                suffix = "rd";
            }
            else
            {
                suffix = "th";
            }
        }

        System.out.println("year is " + year);
        System.out.println("month is " + month);
        System.out.println("day is " + day + suffix);

        HashMap<String, String> mapT = new HashMap<>();
        mapT.put("00", "00");
        mapT.put("01", "1");
        mapT.put("02", "2");
        mapT.put("03", "3");
        mapT.put("04", "4");
        mapT.put("05", "5"); 
        mapT.put("06", "6");
        mapT.put("07", "7");
        mapT.put("08", "8");
        mapT.put("09", "");
        mapT.put("10", "10");
        mapT.put("11", "11");
        mapT.put("12", "00");
        mapT.put("13", "1");
        mapT.put("14", "2");
        mapT.put("15", "3");
        mapT.put("16", "4");
        mapT.put("17", "5");
        mapT.put("18", "6");
        mapT.put("19", "7");
        mapT.put("20", "8");
        mapT.put("21", "9");
        mapT.put("22", "10");
        mapT.put("23", "11");

        String [] arrayOfTime = time.split(":");
        String hour = "";
        String minutes = arrayOfTime[1];

        String daySuffix = "";

        int myHour = Integer.parseInt(arrayOfTime[0]);
        if(myHour < 12)
        {
            daySuffix = "am";
        }
        else
        {
            daySuffix = "pm";
        }

        for(Map.Entry<String, String> entry : mapT.entrySet())
        {
            if(arrayOfTime[0].equals(entry.getKey()))
            {
                hour = entry.getValue();
            }
        }
        System.out.println(hour + ":" + minutes + " " + daySuffix + " on the " + day + suffix + " of " + month + " '" + year);


    }
}
