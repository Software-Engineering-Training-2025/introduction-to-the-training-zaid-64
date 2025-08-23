
import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    void add_twoPositiveNumbers() {
        double r = calc.calculate(10, 5, Calculator.Operator.ADD);
        assertEquals(15.0, r, 1e-9);
    }

    @Test
    void subtract_withNegativeResult() {
        double r = calc.calculate(3, 7, Calculator.Operator.SUBTRACT);
        assertEquals(-4.0, r, 1e-9);
    }

    @Test
    void multiply_decimals() {
        double r = calc.calculate(2.5, 4, Calculator.Operator.MULTIPLY);
        assertEquals(10.0, r, 1e-9);
    }

    @Test
    void divide_basic() {
        double r = calc.calculate(9, 3, Calculator.Operator.DIVIDE);
        assertEquals(3.0, r, 1e-9);
    }

    @Test
    void divide_byZero_shouldThrow() {

        assertThrows(ArithmeticException.class,
                () -> calc.calculate(1, 0, Calculator.Operator.DIVIDE));
    }
}
