public class RevertIntegerReturnArray {

    public int[] solution(long n) {
        int v = (int) Math.log10(n);
        int[] answer = new int[v + 1];
        for (int i = 0; i <= v; i++) {
            answer[i] = (int) (n % 10);
            n = n / 10;
        }
        return answer;
    }
}
