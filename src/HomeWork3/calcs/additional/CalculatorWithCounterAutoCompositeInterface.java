package HomeWork3.calcs.additional;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoCompositeInterface implements ICalculator {

    private long operationCounter;

    private final ICalculator calculator;

    public CalculatorWithCounterAutoCompositeInterface(ICalculator calculator) {
        this.calculator = calculator;
    }

    public long getCountOperation() {
        return operationCounter;
    }

    public double addition(double firstNumber, double secondNumber) {
        operationCounter++;
        return this.calculator.addition(firstNumber, secondNumber);
    }

    public double subtraction(double firstNumber, double secondNumber) {
        operationCounter++;
        return this.calculator.subtraction(firstNumber, secondNumber);
    }

    public double multiply(double firstNumber, double secondNumber) {
        operationCounter++;
        return this.calculator.multiply(firstNumber, secondNumber);
    }

    public double division(double firstNumber, double secondNumber) {
        operationCounter++;
        return this.calculator.division(firstNumber, secondNumber);
    }

    public double power(double number, int exponent) {
        operationCounter++;
        return this.calculator.power(number, exponent);
    }

    public double abs(double number) {
        operationCounter++;
        return this.calculator.abs(number);
    }

    public double sqrt(double number) {
        operationCounter++;
        return this.calculator.sqrt(number);
    }
}
