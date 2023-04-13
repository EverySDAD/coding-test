import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FindKIMTest {

    FindKIM findKIM = new FindKIM();

    @Test
    @Order(1)
    void seoul (){
        String[] seoul = {"Jane", "Kim"};
        String solution = findKIM.solution(seoul);
        assertEquals(solution,"김서방은 1에 있다");
    }


}