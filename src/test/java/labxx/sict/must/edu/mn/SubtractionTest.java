package labxx.sict.must.edu.mn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractionTest {
    @Test
    void testSubtractPositiveResult() {
        Subtraction calc = new Subtraction();
        assertEquals(5.0, calc.subtract(8.0, 3.0), "8 - 3 should equal 5");
    }

    @Test
    void testSubtractNegativeResult() {
        Subtraction calc = new Subtraction();
        assertEquals(-10.0, calc.subtract(5.0, 15.0), "5 - 15 should equal -10");
    }
}