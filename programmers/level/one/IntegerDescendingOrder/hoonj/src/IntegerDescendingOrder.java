import java.util.Collections;

public class IntegerDescendingOrder {

    public long solution(long n) {
        System.out.println(n);
        long answer = 0;
        int[] ints = new StringBuilder().append(n).chars().boxed().sorted(Collections.reverseOrder()).mapToInt(value -> value).toArray();
        StringBuilder strb = new StringBuilder();
        for (int anInt : ints) {
            strb.append((char) anInt);
        }
        return Long.parseLong(strb.toString());
    }
}
