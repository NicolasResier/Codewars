package Number07_EasyWallpaper;

public class Main {
    public String wallpaper(double l, double w, double h) {
        if (l*w*h == 0) return "zero";
        double sup = (l * h * 2) + (w * h * 2);
        double wallpaperSup = 10*0.52;
        int ans = (int) Math.ceil(sup *1.15 / wallpaperSup);
        switch (ans) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            case 20: return "twenty";
            default: return null;
        }
    }
}
