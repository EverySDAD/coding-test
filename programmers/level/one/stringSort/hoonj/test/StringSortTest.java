import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class StringSortTest {

    private static StringSort stringSort;

    @BeforeAll
    static void setup() {
        stringSort = new StringSort();
    }

    @Test
    @DisplayName("sun, bed, car / 1")
    void sun_bed_car_1() {
        String[] solution = stringSort.solution(new String[]{"sun", "bed", "car"}, 1);
        assertArrayEquals(solution, new String[]{"car", "bed", "sun"});
    }

    @Test
    @DisplayName("abce, abcd, cdx / 2")
    void abce_abcd_cdx_2() {
        String[] solution = stringSort.solution(new String[]{"abce", "abcd", "cdx"}, 2);
        assertArrayEquals(solution, new String[]{"abcd", "abce", "cdx"});
    }
}