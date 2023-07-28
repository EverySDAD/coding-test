import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerSquareRootDeterminationTest {

    IntegerSquareRootDetermination integerSquareRootDetermination = new IntegerSquareRootDetermination();

    @Test
    void 정수제곱근판별(){
        assertEquals(integerSquareRootDetermination.solution(121),144);
        assertEquals(integerSquareRootDetermination.solution(3),-1);
    }
}