package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

    public double addition(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double subtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public double division(double firstNumber, double secondNumber) {
        if(secondNumber == 0) {
            return Double.NaN;
        } else {
            return firstNumber / secondNumber;
        }
    }

    public double power(double number, int exponent) {
        double result = 1;
        if(exponent < 0.0d) {
            return Double.NaN;
        } else {
            for(int i = 0; i < exponent; i ++) {
                result = result * number;
            }
        }
        return result;
    }

    public double abs(double number) {
        if (number <= 0.0d) {
            return 0.0d - number;
        } else {
            return number;
        }
    }

    public double sqrt(double number) {
         return Math.sqrt(number);
    }
}
