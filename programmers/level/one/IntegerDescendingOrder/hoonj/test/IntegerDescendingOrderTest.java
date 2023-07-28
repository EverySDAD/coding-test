import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerDescendingOrderTest {

    IntegerDescendingOrder integerDescendingOrder = new IntegerDescendingOrder();

    @Test
    void 성부내임차순으로배치하기(){
        assertEquals(integerDescendingOrder.solution(118372),873211);
    }

}