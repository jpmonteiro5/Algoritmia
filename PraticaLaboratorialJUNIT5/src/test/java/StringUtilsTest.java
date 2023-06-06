import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StringUtilsTest {
    private StringUtils stringUtils;
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
    @Test
    public void testAdd() {
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        assertEquals(3,calculator.subtract(5,2));
        assertEquals(0,calculator.subtract(0,0));

    }

    @Test
    public void testMultiply() {
        assertEquals(10,calculator.multiply(5,2));
        assertEquals(0,calculator.multiply(0,0));
    }
    @Test
    public void testDivide() {
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }
    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}