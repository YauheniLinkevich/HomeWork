package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoCompositeInterface;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {

    public static void main(String[] args) {

        CalculatorWithCounterAutoCompositeInterface c1 =
                new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithOperator());
        double result1 = c1.addition(c1.addition(4.1, c1.multiply(15, 7)), c1.power(c1.division(28, 5), 2));
        System.out.println(result1); // == 140.45999999999998
        System.out.println(c1.getCountOperation()); // == 5

        CalculatorWithCounterAutoCompositeInterface c2 =
                new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathCopy());
        double result2 = c2.addition(c2.addition(4.1, c2.multiply(15, 7)), c2.power(c2.division(28, 5), 2));
        System.out.println(result2); // == 140.45999999999998
        System.out.println(c2.getCountOperation()); // == 5

        CalculatorWithCounterAutoCompositeInterface c3 =
                new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathExtends());
        double result3 = c3.addition(c3.addition(4.1, c3.multiply(15, 7)), c3.power(c3.division(28, 5), 2));
        System.out.println(result3); // == 140.45999999999998
        System.out.println(c3.getCountOperation()); // == 5

    }
}
