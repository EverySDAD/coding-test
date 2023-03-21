import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CenterCharSolutionTest {

    CenterCharSolution centerCharSolution = new CenterCharSolution();

    @Test
    @DisplayName("abcde -> c")
    void solution_abcde() {
        String rtnStr = centerCharSolution.solution("abcde");
        assertEquals(rtnStr, "c");
    }

    @Test
    @DisplayName("qwer -> we")
    void solution_qwer() {
        String rtnStr = centerCharSolution.solution("qwer");
        assertEquals(rtnStr, "we");
    }

    @Test
    @DisplayName("asdf -> sd")
    void solution_asdf() {
        String rtnStr = centerCharSolution.solution("asdf");
        assertEquals(rtnStr, "sd");
    }

    @Test
    @DisplayName("asd -> s")
    void solution_asd() {
        String rtnStr = centerCharSolution.solution("asd");
        assertEquals(rtnStr, "s");
    }
}