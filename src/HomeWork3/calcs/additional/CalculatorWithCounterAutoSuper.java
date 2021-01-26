package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long operationCounter;

    public long getCountOperation() {
        return operationCounter;
    }
    @Override
    public double addition(double firstNumber, double secondNumber) {
        operationCounter++;
        return super.addition(firstNumber, secondNumber);
    }
    @Override
    public double subtraction(double firstNumber, double secondNumber) {
        operationCounter++;
        return super.subtraction(firstNumber, secondNumber);
    }
    @Override
    public double multiply(double firstNumber, double secondNumber) {
        operationCounter++;
        return super.multiply(firstNumber, secondNumber);
    }
    @Override
    public double division(double firstNumber, double secondNumber) {
        operationCounter++;
        return super.division(firstNumber, secondNumber);
    }
    @Override
    public double power(double number, int exponent) {
        operationCounter++;
        return super.power(number, exponent);
    }
    @Override
    public double abs(double number) {
        operationCounter++;
        return super.abs(number);
    }
    @Override
    public double sqrt(double number) {
        operationCounter++;
        return super.sqrt(number);
    }
}
