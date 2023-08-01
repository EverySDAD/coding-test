import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollatzGuessingTest {

    CollatzGuessing collatzGuessing = new CollatzGuessing();

    @Test
    void 콜라트_추측() {
        assertEquals(collatzGuessing.solution(6),8);
        assertEquals(collatzGuessing.solution(16),4);
        assertEquals(collatzGuessing.solution(626331),-1);
    }
}