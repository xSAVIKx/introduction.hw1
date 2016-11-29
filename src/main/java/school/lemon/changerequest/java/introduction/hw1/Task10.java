package school.lemon.changerequest.java.introduction.hw1;


public class Task10 {

    public static boolean containDigitTwo(int n) {
        n = Math.abs(n);
        while (n > 0) {
            if (n % 10 == 2) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
}
