package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {

    public static void main(String[] args) {

        CalculatorWithCounterAutoSuper c = new CalculatorWithCounterAutoSuper();
        double result = c.addition(c.addition(4.1, c.multiply(15, 7)), c.power(c.division(28, 5), 2));
        System.out.println(result); // == 140.45999999999998
        System.out.println(c.getCountOperation()); // == 5
    }
}
