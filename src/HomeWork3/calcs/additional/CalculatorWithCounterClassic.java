package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    private long operationCounter;

    public void incrementCountOperation() {
        operationCounter++;
    }

    public long getCountOperation() {
        return operationCounter;
    }
}
