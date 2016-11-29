package school.lemon.changerequest.java.introduction.hw1;


public class Task5 {
    public static double calculateA(double x, double y, double z) {
        double top = 2 * Math.sin(x - Math.PI / 6) * calculateB(z);
        double bottom = 1 / 2.0 + (Math.pow(Math.sin(y), 2));
        return top / bottom;
    }

    private static double calculateB(double z) {
        double zSquare = Math.pow(z, 2);
        return 1 + zSquare / (3 + (zSquare / 5));
    }
}
