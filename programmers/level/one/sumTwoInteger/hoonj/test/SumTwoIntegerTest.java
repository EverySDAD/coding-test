import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumTwoIntegerTest {

    private static SumTwoInteger sumTwoInteger;

    @BeforeAll
    static void setup(){
        sumTwoInteger = new SumTwoInteger();
    }

    @Test
    @DisplayName("3,5 -> 12")
    void sum3_5(){
        long solution = sumTwoInteger.solution(3, 5);
        assertEquals(solution, 12);
    }

    @Test
    @DisplayName("3,3 -> 3")
    void sum3_3(){
        long solution = sumTwoInteger.solution(3, 3);
        assertEquals(solution, 3);
    }

    @Test
    @DisplayName("5,3 -> 12")
    void sum5_3(){
        long solution = sumTwoInteger.solution(5, 3);
        assertEquals(solution, 12);
    }
}