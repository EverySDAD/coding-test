import java.time.LocalDate;

public class Solution {
    public static String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        return switch (date.getDayOfWeek().getValue()) {
            case 1 -> "MON";
            case 2 -> "TUE";
            case 3 -> "WED";
            case 4 -> "THU";
            case 5 -> "FRI";
            case 6 -> "SAT";
            case 7 -> "SUN";
            default -> null;
        };
    }
}
