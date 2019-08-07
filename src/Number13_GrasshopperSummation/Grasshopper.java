package Number13_GrasshopperSummation;

public class Grasshopper {
    public static int summation(int n) {
        int x = 0;
        for (int i = 1; i < n+1; i++) x += i;
        return x;
    }
}
