import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        int num1 = 5;
        int num2 = 5;
        assertEquals(10, calculator.Add(num1, num2));
    }

    @Test
    public void canSubtract() {
        int num1 = 55;
        int num2 = 35;
        assertEquals(20, calculator.Subtract(num1, num2));
    }

    @Test
    public void canMultiply() {
        int num1 = 5;
        int num2 = 7;
        assertEquals(35, calculator.Multiply(num1, num2));
    }

    @Test
    public void canDivide() {
        double num1 = 100;
        double num2 = 3;
        assertEquals(33.33, calculator.Divide( num1, num2), 0.00);
    }




}
