public class Subag {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        final String subag = "수박";
        int i = n / 2;
        for (int j = 0; j < i; j++) {
            answer.append(subag);
        }
        if (n % 2 == 1) {
            answer.append("수");
        }
        return answer.toString();
    }
}
