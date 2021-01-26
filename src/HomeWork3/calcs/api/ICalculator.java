package HomeWork3.calcs.api;

public interface  ICalculator {

    public double addition(double firstNumber, double secondNumber);

    public double subtraction(double firstNumber, double secondNumber);

    public double multiply(double firstNumber, double secondNumber);

    public double division(double firstNumber, double secondNumber);

    public double power(double number, int exponent);

    public double abs(double number);

    public double sqrt(double number);
}
