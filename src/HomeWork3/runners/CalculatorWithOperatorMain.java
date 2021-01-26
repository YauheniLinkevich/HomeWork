package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {

    public static void main(String[] args) {

        CalculatorWithOperator c = new CalculatorWithOperator();

        double result = c.addition(c.addition(4.1, c.multiply(15, 7)), c.power(c.division(28, 5), 2));
        System.out.println(result); // == 140.45999999999998
    }
}
