import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDLCMTest {

    GCDLCM gcdlcm = new GCDLCM();

    @Test
    void 최대공약수와_최소공배수 () {
        assertArrayEquals(gcdlcm.solution(3,12), new int[]{3, 12});
        assertArrayEquals(gcdlcm.solution(2,5), new int[]{1,10});
    }
}