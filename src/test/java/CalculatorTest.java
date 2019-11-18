import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void add(){
        assertEquals(3.02, calculator.add(2.01, 1.01), 0.01);
    }

    @Test
    public void subtract(){
        assertEquals(1.00, calculator.subtract(2.01, 1.01), 0.01);
    }
}
