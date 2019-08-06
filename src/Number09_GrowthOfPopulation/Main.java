package Number09_GrowthOfPopulation;

public class Main {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int ans = 0;
        while (p0 < p) {
            ans += 1;
            p0 += (int) Math.round(p0 * (percent / 100.0)) + aug;
        }
        return ans;
    }
}