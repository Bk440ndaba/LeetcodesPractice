import java.io.*;
import java.util.*;

public class CateFile {
    public static void main(String[] args) {

        

        try {
            BufferedWriter writer = new BufferedWriter( new FileWriter("categories.txt"));
            writer .write("t\n");
            writer.write("th\n");
            writer.write("a\n");
            writer.write("thr");

            writer.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
