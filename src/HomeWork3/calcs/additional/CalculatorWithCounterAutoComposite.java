package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {

    private long operationCounter;

    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathCopy calculatorWithMathCopy;
    private CalculatorWithMathExtends calculatorWithMathExtends;

    public CalculatorWithCounterAutoComposite(CalculatorWithOperator calc) {
        this.calculatorWithOperator = calc;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calc) {
        this.calculatorWithMathCopy = calc;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends calc) {
        this.calculatorWithMathExtends = calc;
    }

    public long getCountOperation() {
        return operationCounter;
    }

    public double addition(double firstNumber, double secondNumber) {
        operationCounter++;
        if(calculatorWithOperator != null) {
            return calculatorWithOperator.addition(firstNumber, secondNumber);
        } else if(calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.addition(firstNumber, secondNumber);
        } else {
            return calculatorWithMathExtends.addition(firstNumber, secondNumber);
        }
    }

    public double subtraction(double firstNumber, double secondNumber) {
        operationCounter++;
        if(calculatorWithOperator != null) {
            return calculatorWithOperator.subtraction(firstNumber, secondNumber);
        } else if(calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.subtraction(firstNumber, secondNumber);
        } else {
            return calculatorWithMathExtends.subtraction(firstNumber, secondNumber);
        }
    }

    public double multiply(double firstNumber, double secondNumber) {
        operationCounter++;
        if(calculatorWithOperator != null) {
            return calculatorWithOperator.multiply(firstNumber, secondNumber);
        } else if(calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.multiply(firstNumber, secondNumber);
        } else {
            return calculatorWithMathExtends.multiply(firstNumber, secondNumber);
        }
    }

    public double division(double firstNumber, double secondNumber) {
        operationCounter++;
        if(calculatorWithOperator != null) {
            return calculatorWithOperator.division(firstNumber, secondNumber);
        } else if(calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.division(firstNumber, secondNumber);
        } else {
            return calculatorWithMathExtends.division(firstNumber, secondNumber);
        }
    }

    public double power(double firstNumber, int exponent) {
        operationCounter++;
        if(calculatorWithOperator != null) {
            return calculatorWithOperator.power(firstNumber, exponent);
        } else if(calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.power(firstNumber, exponent);
        } else {
            return calculatorWithMathExtends.power(firstNumber, exponent);
        }
    }

    public double abs(double number) {
        operationCounter++;
        if(calculatorWithOperator != null) {
            return calculatorWithOperator.abs(number);
        } else if(calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.abs(number);
        } else {
            return calculatorWithMathExtends.abs(number);
        }
    }

    public double sqrt(double number) {
        operationCounter++;
        if(calculatorWithOperator != null) {
            return calculatorWithOperator.sqrt(number);
        } else if(calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.sqrt(number);
        } else {
            return calculatorWithMathExtends.sqrt(number);
        }
    }
}
