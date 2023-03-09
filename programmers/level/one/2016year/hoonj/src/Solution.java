import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 날짜지정, 2. 랜덤한 날짜 1000회 반복");
        System.out.print("선택하쇼: ");
        int input = sc.nextInt();
        if (input == 1) {
            run2016Test(sc);
        } else {
            runFor1000Test();
        }
    }

    /**
     * 특정한 날짜 지정해서 확인
     * @param sc
     */
    private static void run2016Test(Scanner sc) {
        System.out.print("2016년 \n월: ");
        int a = sc.nextInt();
        System.out.print("일: ");
        int b = sc.nextInt();
        System.out.println(a + "월 " + b + "일 - " + solution2016(a, b));
    }

    /**
     * 랜덤한 2016년의 날짜로 1000회 반복하가
     */
    private static void runFor1000Test() {
        for (int i = 0; i < 1000; i++) {
            int a = new Random().nextInt(12) + 1;
            int bTemp = switch (a) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> 29;
                default -> 30;
            };
            int b = new Random().nextInt(bTemp) + 1;
            System.out.println(a + "월 " + b + "일 - " + solution2016(a, b));
        }
    }

    private static String solution2016(int a, int b) {
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
