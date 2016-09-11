package school.lemon.changerequest.java.hw1;


public class Task4 {

    public static double getSumOfGreatest(double a, double b, double c) {
        if (a > b && b > c) {
            return a + b;
        }
        if (a > b && b < c) {
            return a + c;
        }
        return b + c;

    }
}
