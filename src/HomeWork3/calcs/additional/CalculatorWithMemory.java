package HomeWork3.calcs.additional;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMemory implements ICalculator{

    private long operationCounter;
    private final ICalculator calculator;
    private double lastOperation, memory;

    public CalculatorWithMemory(ICalculator calculator) {
        this.calculator = calculator;
    }

    public double addition(double firstNumber, double secondNumber) {
        operationCounter++;
        lastOperation = this.calculator.addition(firstNumber, secondNumber);
        recordToMemory();
        return lastOperation;
    }

    public double subtraction(double firstNumber, double secondNumber) {
        operationCounter++;
        lastOperation = this.calculator.subtraction(firstNumber, secondNumber);
        recordToMemory();
        return lastOperation;
    }

    public double multiply(double firstNumber, double secondNumber) {
        operationCounter++;
        lastOperation = this.calculator.multiply(firstNumber, secondNumber);
        recordToMemory();
        return lastOperation;
    }

    public double division(double firstNumber, double secondNumber) {
        operationCounter++;
        lastOperation = this.calculator.division(firstNumber, secondNumber);
        recordToMemory();
        return lastOperation;
    }

    public double power(double number, int exponent) {
        operationCounter++;
        lastOperation = this.calculator.power(number, exponent);
        recordToMemory();
        return lastOperation;
    }

    public double abs(double number) {
        operationCounter++;
        lastOperation = this.calculator.abs(number);
        recordToMemory();
        return lastOperation;
    }

    public double sqrt(double number) {
        operationCounter++;
        lastOperation = this.calculator.sqrt(number);
        recordToMemory();
        return lastOperation;
    }

    private void clearMemory() {
        memory = 0;
    }

    private void recordToMemory() {
        memory = lastOperation;
    }

    public double getMemory(){
        double tmpValue = memory;
        clearMemory();
        return tmpValue;
    }
}
