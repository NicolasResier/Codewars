package Number03_HowGoodAreYouReally;

public class Main {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        Boolean x= false;
        int y = 0;
        for (int i = 0; i < classPoints.length; i++) {
            y += classPoints[i];
        }
        if (yourPoints > y/classPoints.length) x = true;
        return x;
    }
}
