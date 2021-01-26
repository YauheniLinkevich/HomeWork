package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {

    public static void main(String[] args) {

        CalculatorWithMathCopy c = new CalculatorWithMathCopy();
        double result = c.addition(c.addition(4.1, c.multiply(15, 7)), c.power(c.division(28, 5), 2));
        System.out.println(result); // == 140.45999999999998

    }
}
