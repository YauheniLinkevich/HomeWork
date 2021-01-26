package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {

    public static void main(String[] args) {

        CalculatorWithMathExtends c = new CalculatorWithMathExtends();
        double result = c.addition(c.addition(4.1, c.multiply(15, 7)), c.power(c.division(28, 5), 2));
        System.out.println(result); // == 140.45999999999998
    }
}
