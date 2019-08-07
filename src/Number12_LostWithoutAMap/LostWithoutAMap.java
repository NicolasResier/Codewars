package Number12_LostWithoutAMap;

public class LostWithoutAMap {
    public static int[] map(int[] arr) {
        int[] x = new int[arr.length];
        for (int i = 0; i < arr.length; i++) x[i] = arr[i]*2;
        return x;
    }
}