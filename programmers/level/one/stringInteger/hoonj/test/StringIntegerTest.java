import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringIntegerTest {

    StringInteger stringInteger = new StringInteger();

    @Test
    @DisplayName("1234")
    void stringInteger1234(){
        assertEquals(1234, stringInteger.solution("1234"));
    }

    @Test
    @DisplayName("-1234")
    void stringInteger_1234(){
        assertEquals(-1234, stringInteger.solution("-1234"));
    }
}