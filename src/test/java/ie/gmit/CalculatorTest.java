package ie.gmit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.Add(10, 50);
        assertEquals(60, result, 0);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        double result = calculator.Divide(50, 10);
        assertEquals(5, result, 0);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        double result = calculator.Subtract(50, 10);
        assertEquals(40, result, 0);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        double result = calculator.Multiply(10, 10);
        assertEquals(100, result, 0);
    }

}
