public class CenterCharSolution {

    String solution(String s) {
        int halfLength = s.length() / 2;
        int holeJjak = s.length() % 2;

        if (holeJjak == 0) {
            return s.substring(halfLength - 1, halfLength + 1);
        } else {
            return s.substring(halfLength, halfLength + 1);
        }
    }
}
