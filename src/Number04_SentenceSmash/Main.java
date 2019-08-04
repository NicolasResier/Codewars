package Number04_SentenceSmash;

public class Main {
    public static String smash(String... words) {
        String x = "";
        for (int i = 0; i < words.length - 1; i++) {
            x += words[i] + " ";
        }
        if (words.length > 0) x += words[words.length-1];
        return x;
    }
}
