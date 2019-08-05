package Number06_MonkeyCounter;

public class Main {
    public static int[] monkeyCount(final int n){
        int[]  x = new int[n];
        for (int i = 0; i < n; i++) x[i] = i+1;
        return x;
    }
}
