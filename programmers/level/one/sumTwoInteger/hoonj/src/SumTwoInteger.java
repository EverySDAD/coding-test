public class SumTwoInteger {
    public long solution(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        long rtn = 0;
        for (int i = min; i <= max; i++) {
            rtn += i;
        }
        return rtn;
    }
}
