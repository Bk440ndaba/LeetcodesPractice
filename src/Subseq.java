import java.util.Scanner;

public class Subseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the full string: ");
        String string = sc.nextLine();

        System.out.println("Enter the subsequence to check for: ");
        String seq = sc.nextLine();

        if(subSeq(string, seq))
        {
            System.out.println("The given substring is a subsequence of the full string. ");
        }
        else
        {
            System.out.println("The given substring is not a subsequence of the full string. ");
        }
    }
    public static boolean subSeq(String string, String seq)
    {
        int idxOfString = 0;
        int idxOfSeq = 0;

       

        while(idxOfSeq < seq.length() && idxOfString <string.length())
        {
            if(seq.charAt(idxOfSeq) == string.charAt(idxOfString))
            {
                idxOfSeq++;
                idxOfString++;
            }
            else
            {
                idxOfString++;
            }
            
        }

        return idxOfSeq == seq.length();
    }
}
