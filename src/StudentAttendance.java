public class StudentAttendance {
    public boolean checkRecord(String s) {
        
        int countForA = 0;

        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i) == 'A')
            {
                countForA++;
            }
        }

        int countForL = 0;
        for(int i = 0; i<s.length() - 2; i++)
        {
            if(s.charAt(i) == 'L' && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L')
            {
                countForL = 3;
            }
        }

        if(countForA < 2 && countForL < 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
