package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {

    public static void main(String[] args) {

        double result;
        double temp;
        CalculatorWithCounterClassic c = new CalculatorWithCounterClassic();

        result = c.multiply(15, 7);
        c.incrementCountOperation();
        result = c.addition(4.1, result);
        c.incrementCountOperation();
        temp = c.division(28, 5);
        c.incrementCountOperation();
        temp = c.power(temp, 2);
        c.incrementCountOperation();
        result = c.addition(result, temp);
        c.incrementCountOperation();

        System.out.println(result); // == 140.45999999999998
        System.out.println(c.getCountOperation()); // == 5
    }
}
