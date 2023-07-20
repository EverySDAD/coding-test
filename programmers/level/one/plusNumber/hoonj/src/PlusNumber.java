import java.util.stream.IntStream;

public class PlusNumber {

    public int solution(int n) {
        int rtn = 0;
        while (n != 0) {
            rtn += n % 10;
            n /= 10;
        }
        return rtn;
    }
}
