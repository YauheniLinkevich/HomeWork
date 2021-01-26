package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
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
        if(exponent < 0.0d) {
            return Double.NaN;
        } else {
            return Math.pow(number, exponent);
        }
    }

    public double abs(double number) {
            return Math.abs(number);
    }

    public double sqrt(double number) {
        return Math.sqrt(number);
    }
}
