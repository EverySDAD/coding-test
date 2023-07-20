import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrangeCharacterTest {

    StrangeCharacter strangeCharacter = new StrangeCharacter();

    @Test
    void 이상한_문자_만들기_테스트 () {
        assertEquals(strangeCharacter.solution("try hello world"), "TrY HeLlO WoRlD");
    }
}