import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicStringTest {

    BasicString basicString = new BasicString();

    @Test
    @DisplayName("a234")
    void test_a234(){
        boolean solution = basicString.solution("a234");
        assertEquals(solution,false);
    }

    @Test
    @DisplayName("1234")
    void test_1234(){
        boolean solution = basicString.solution("1234");
        assertEquals(solution,true);
    }
}