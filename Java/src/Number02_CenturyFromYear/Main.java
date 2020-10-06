package Number02_CenturyFromYear;

public class Main {
    public static int century(int number) {
        number = (int) Math.ceil(number/100.0);
        return number;
    }
}
