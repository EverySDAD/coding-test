import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RevertIntegerReturnArrayTest {

    RevertIntegerReturnArray revertIntegerReturnArray = new RevertIntegerReturnArray();

    @Test
    void 자연수_뒤집어서_배열로_만들기 () {
        assertArrayEquals(revertIntegerReturnArray.solution(12345), new int[]{5,4,3,2,1});
    }

}