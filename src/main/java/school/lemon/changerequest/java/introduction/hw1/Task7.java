package school.lemon.changerequest.java.introduction.hw1;


public class Task7 {
    public static String getDayTitle(int dayIndex) {
        switch (dayIndex) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "error";
        }
    }
}
