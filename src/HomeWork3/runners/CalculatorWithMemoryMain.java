package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithMemory;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMemoryMain {

    public static void main(String[] args) {

        CalculatorWithMemory c = new CalculatorWithMemory(new CalculatorWithMathExtends());

        System.out.println(c.addition(c.addition(4.1, c.multiply(15, 7)), c.power(c.division(28, 5), 2)));
        System.out.println(c.getMemory());  // == 140.45999999999998
        System.out.println(c.getMemory()); // == 0.0
    }
}
