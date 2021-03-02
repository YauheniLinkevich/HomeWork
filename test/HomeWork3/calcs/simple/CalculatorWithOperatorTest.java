package HomeWork3.calcs.simple;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorWithOperatorTest {

    private final CalculatorWithOperator c = new CalculatorWithOperator();

    @Test
    @DisplayName("Проверка класса CalculatorWithOperator")
    public void CalculatorWithOperatorTest(){
        try {
            assertEquals(140.45999999999998,
                    c.addition(c.addition(4.1, c.multiply(15, 7)), c.power(c.division(28, 5), 2)));
        } catch(AssertionFailedError e) {
            System.out.println(e.getMessage());
        }

        try {
            assertEquals(140.45999999999995,
                    c.addition(c.addition(4.1, c.multiply(15, 7)), c.power(c.division(28, 5), 2)));
        } catch(AssertionFailedError e) {
            System.out.println(e.getMessage());
        }

        try {
            assertEquals(27,
                    c.multiply(c.addition(1, 2), c.power(3, 2)));
        } catch(AssertionFailedError e) {
            System.out.println(e.getMessage());
        }

        try {
            assertEquals(212103,
                    c.multiply(c.addition(1, 2), c.power(3, 2)));
        } catch(AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
        try {
            assertEquals("",
                    c.multiply(c.addition(1, 2), c.power(3, 2)));
        } catch(AssertionFailedError e) {
            System.out.println(e.getMessage());
        }

        try {
            assertEquals(-81,
                    c.multiply(c.addition(1, 2), c.power(3, -3)));
        } catch(AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }
}
