package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithCounterClassicTest {

    private final CalculatorWithCounterClassic c = new CalculatorWithCounterClassic();

    @Test
    @DisplayName("Проверка класса CalculatorWithOperator")
    public void CalculatorWithMathExtendsTest(){
        try {
            assertEquals(140.45999999999998,
                    c.addition(c.addition(4.1, c.multiply(15, 7)), c.power(c.division(28, 5), 2)));
        } catch(AssertionFailedError e) {
            System.out.println(e.getMessage());
        }

        try {
            c.addition(c.addition(4.1, c.multiply(15, 7)), c.power(c.division(28, 5), 2));
            assertEquals(4, c.getCountOperation());
        } catch(AssertionFailedError e) {
            System.out.println(e.getMessage());
        }

        try {
            c.multiply(c.addition(1, 2), c.power(3, 2));
            assertEquals(3, c.getCountOperation());
        } catch(AssertionFailedError e) {
            System.out.println(e.getMessage());
        }

        try {
            assertEquals(34057395,
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
            c.multiply(c.addition(1, 2), c.power(3, -3));
            assertEquals(-2, c.getCountOperation());
        } catch(AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }
}
