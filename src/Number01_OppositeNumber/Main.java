package Number01_OppositeNumber;

public class Main {
    public static int opposite(int number) {
        number -= 2*number;
        return number;
    }
}