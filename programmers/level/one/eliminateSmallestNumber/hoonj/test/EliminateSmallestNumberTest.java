import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EliminateSmallestNumberTest {

    EliminateSmallestNumber eliminateSmallestNumber = new EliminateSmallestNumber();

    @Test
    void 제일_작은_수_제거하기 () {
        assertArrayEquals(eliminateSmallestNumber.solution(new int[]{4, 3, 2, 1}), new int[]{4, 3, 2});
        assertArrayEquals(eliminateSmallestNumber.solution(new int[]{10}), new int[]{-1});
    }

}