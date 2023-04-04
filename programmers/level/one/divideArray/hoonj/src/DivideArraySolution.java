import java.util.Arrays;

public class DivideArraySolution {
    public int[] solution(int[] arr, int divisor) {
        int[] solution = Arrays.stream(arr).filter(v -> v % divisor == 0).sorted().toArray();
        if (solution.length == 0) {
            return new int[]{-1};
        }
        return solution;
    }
}
