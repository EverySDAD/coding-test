
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarpasswordTest {
    private Caesarpassword caesarpassword = new Caesarpassword();

    @Test
    @DisplayName("AB_1_BC")
    void ab1bc () {
        assertEquals("BC",caesarpassword.solution("AB",1));
    }

    @Test
    @DisplayName("z_1_a")
    void z1a () {
        assertEquals("a",caesarpassword.solution("z",1));
    }

    @Test
    @DisplayName("a B z_4_eFd")
    void aBz4Fd () {
        assertEquals("e F d",caesarpassword.solution("a B z",4));
    }
}