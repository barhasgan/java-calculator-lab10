package labxx.sict.must.edu.mn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {
    @Test
    void testAddPositive() {
        Addition calc = new Addition();
        assertEquals(5.0, calc.add(2.0, 3.0), "2 + 3 should equal 5");
    }
    
    @Test
    void testAddNegative() {
        Addition calc = new Addition();
        assertEquals(-1.0, calc.add(-4.0, 3.0), "-4 + 3 should equal -1");
    }
}