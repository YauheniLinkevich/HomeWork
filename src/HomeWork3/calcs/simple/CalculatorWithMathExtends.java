package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    @Override
    public double power(double number, int exponent) {
        if(exponent < 0.0d) {
            return Double.NaN;
        } else {
            return Math.pow(number, exponent);
        }
    }
    @Override
    public double abs(double number) {
        return Math.abs(number);
    }
    @Override
    public double sqrt(double number) {
        return Math.sqrt(number);
    }
}
