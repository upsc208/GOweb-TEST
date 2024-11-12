package gcu.msa.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("Test Sum Method")
    public void testSum() {
        assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    @DisplayName("Test Subtraction Method")
    public void testSub() {
        assertEquals(-3, calculator.sub(3, 6));
    }

    @Test
    @DisplayName("Test Multiplication Method")
    public void testMul() {
        assertEquals(10, calculator.mul(2, 5));
    }

    @Test
    @DisplayName("Test Division Method")
    public void testDiv() {
        assertEquals(6, calculator.div(12, 2));
    }
}
