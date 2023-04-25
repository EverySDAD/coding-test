import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubagTest {

    Subag subag = new Subag();

    @Test
    @DisplayName("수박수")
    void subag_3() {
        String solution = subag.solution(3);
        assertEquals(solution, "수박수");
    }

    @Test
    @DisplayName("수박수박")
    void subag_4() {
        String solution = subag.solution(4);
        assertEquals(solution, "수박수박");
    }

}