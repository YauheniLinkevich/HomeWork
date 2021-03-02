package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithOperator;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithCounterAutoCompositeInterfaceTest {

    private final CalculatorWithCounterAutoCompositeInterface c =
            new CalculatorWithCounterAutoCompositeInterface(
                    new CalculatorWithMemory(
                            new CalculatorWithOperator()));

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
            assertEquals(9999, c.getCountOperation());
        } catch(AssertionFailedError e) {
            System.out.println(e.getMessage());
        }

        try {
            c.multiply(c.addition(1, 2), c.power(3, 2));
            assertEquals(13, c.getCountOperation());
        } catch(AssertionFailedError e) {
            System.out.println(e.getMessage());
        }

        try {
            assertEquals(1000,
                    c.multiply(c.addition(1, 2), c.power(3, 2)));
        } catch(AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
        try {
            assertEquals("92034ujffjwei qweqwe",
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
