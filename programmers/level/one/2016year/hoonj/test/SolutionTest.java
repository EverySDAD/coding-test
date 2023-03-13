import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SolutionTest {

    @Test
    @DisplayName("1월1일")
    void solution1_1() {
        String solution = Solution.solution(1, 1);
        assertEquals("FRI",solution);
    }

    @Test
    @DisplayName("5월24일")
    void solution5_24() {
        String solution = Solution.solution(5, 24);
        assertEquals("TUE",solution);
    }

    @Test
    @DisplayName("7월26일")
    void solution7_26() {
        String solution = Solution.solution(7, 26);
        assertEquals("TUE",solution);
    }
}