package school.lemon.changerequest.java.introduction.hw1;

public class Task6 {
    public static double calculateS(double x) {
        double result = 1 + x;
        for (int i = 2; i < 5; i++) {
            result += Math.pow(x, i) / factorial(i);
        }
        return result;

    }

    private static long factorial(final int n) {
        if (n < 0) {
            return 0;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static double calculateZ(double x, double y) {
        return Math.sin(Math.pow(x, 3)) + Math.pow(Math.cos(y), 2);
    }
}
