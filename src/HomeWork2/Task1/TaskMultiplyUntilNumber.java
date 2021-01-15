package HomeWork2.Task1;

import java.lang.management.MonitorInfo;

public class TaskMultiplyUntilNumber {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        int resultValue = multiplyTillSize(number);

        if (resultValue == Integer.MIN_VALUE) {
            System.out.println("Value overflow!");
        } else {
            System.out.println("Result:" + resultValue);
        }
    }

    public static int multiplyTillSize(int size) {
        if(size == 0){
            return 0;
        }
        int result = 1;
        for (int i = 1; i <= size; i++) {
            try {
                result = Math.multiplyExact(result, i);
            } catch (ArithmeticException e) {
                return result = Integer.MIN_VALUE;
            }
        }
        return result;
    }
}
