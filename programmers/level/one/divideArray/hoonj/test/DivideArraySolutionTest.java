import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideArraySolutionTest {

    DivideArraySolution divideArraySolution = new DivideArraySolution();

    @Test
    @DisplayName("5,9,7,10을 5로 나눔")
    void divisor5_9_7_10to5() {
        int[] solution = divideArraySolution.solution(new int[]{5, 9, 7, 10}, 5);
        assertArrayEquals(solution, new int[]{5, 10});
    }

    @Test
    @DisplayName("2,36,1,3을 1로 나눔")
    void divisor2_36_1_3to1() {
        int[] solution = divideArraySolution.solution(new int[]{2, 36, 1, 3}, 1);
        assertArrayEquals(solution, new int[]{1, 2, 3, 36});
    }

    @Test
    @DisplayName("3,2,6을 10로 나눔")
    void divisor3_2_6to10() {
        int[] solution = divideArraySolution.solution(new int[]{3, 2, 6}, 10);
        assertArrayEquals(solution, new int[]{-1});
    }
}