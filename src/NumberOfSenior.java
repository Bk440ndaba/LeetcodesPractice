public class NumberOfSenior {
    public int countSeniors(String[] details) {
        /*  Input: details = ["7868190130M7522","5303914400F9211","9273338290F4010"]
            Output: 2   */
        int count = 0;
        for(int i = 0; i<details.length; i++)
        {
             String info = details[i];
             String firstDigitOfAge = (String.valueOf(info.charAt(11)));
             String lastDigitOfAge = (String.valueOf(info.charAt(12)));

             String combinedAge = firstDigitOfAge + lastDigitOfAge;
             int fAge = Integer.parseInt(combinedAge);

             if(fAge > 60)
             {
                count++;
             }
        }

        return count;
    }
}
