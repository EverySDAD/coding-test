import java.util.Arrays;

public class EliminateSmallestNumber {

    public int[] solution(int[] arr) {
        int min = Arrays.stream(arr).min().orElseThrow();
        int[] answer = Arrays.stream(arr).filter(value -> value != min).toArray();
        if (answer.length == 0) {
            return new int[] {-1};
        }else{
            return answer;
        }
    }
}
