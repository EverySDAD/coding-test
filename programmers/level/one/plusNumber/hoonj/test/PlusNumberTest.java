import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusNumberTest {

    PlusNumber plusNumber = new PlusNumber();

    @Test
    void 자리수_더하기_테스트 () {
        assertEquals(plusNumber.solution(123), 6);
        assertEquals(plusNumber.solution(987), 24);
    }
}