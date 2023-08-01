import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {

    EvenOdd evenOdd = new EvenOdd();

    @Test
    void 짝수와_홀수 () {
        assertEquals(evenOdd.solution(3),"Odd");
        assertEquals(evenOdd.solution(4),"Even");
    }

}