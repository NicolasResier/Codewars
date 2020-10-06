package Number08_CantSleepCountSheep;

public class Main {
    public static String countingSheep(int num) {
        String ans = "";
        for (int i = 1; i < num+1; i++) {
            ans = ans + Integer.toString(i) + " sheep...";
        }
        return ans;
    }
}
