package Number14_BelancedNumber;

public class BalancedNumber {

    public static String balancedNum(long number)
    {

        String numberToString = String.valueOf(number);
        if(numberToString.length() % 2 == 1){
            char[] ch = numberToString.toCharArray();
            int leftside = 0;
            int rightside = 0;
            for (int i = 0; i < numberToString.length()/2-0.5; i++) {
                leftside += Integer.parseInt(String.valueOf(ch[i]));
                rightside += Integer.parseInt(String.valueOf(ch[ch.length-1 -i]));
            }

            if(leftside == rightside){return "Balanced";}else{return "Not Balanced";}
        }else{
            char[] ch = numberToString.toCharArray();
            int leftside = 0;
            int rightside = 0;
            for (int i = 0; i < numberToString.length()/2-1; i++) {
                leftside += Integer.parseInt(String.valueOf(ch[i]));
                rightside += Integer.parseInt(String.valueOf(ch[ch.length-1 -i]));
            }
            if(leftside == rightside){return "Balanced";}else{return "Not Balanced";}
        }
    }

}
