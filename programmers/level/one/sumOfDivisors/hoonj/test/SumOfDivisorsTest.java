import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDivisorsTest {

    SumOfDivisors sumOfDivisors = new SumOfDivisors();

    @Test
    @DisplayName("테스트")
    void 기본_테스트() {
        assertEquals(sumOfDivisors.solution(12), 28);
        assertEquals(sumOfDivisors.solution(5), 6);
    }



}