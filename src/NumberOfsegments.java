public class NumberOfsegments {
    public int countSegments(String s) {
        /*  Input: s = "Hello, my name is John"
            Output: 5 */
        String empty = "";
        if(s.equals(empty))
        {
            return 0;
        }

        String [] array = s.split(" ");
        int length = array.length;

        return length;
    }
}
