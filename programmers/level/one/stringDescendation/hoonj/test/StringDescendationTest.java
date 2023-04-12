import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringDescendationTest {

    StringDescendation stringDescendation = new StringDescendation();

    @Test
    @DisplayName("Zbcdefg -> gfedcbZ")
    void descendation_Zbcdefg (){
        String zbcdefg = stringDescendation.solution("Zbcdefg");
        assertEquals(zbcdefg,"gfedcbZ");
    }
}