package HomeWork2.Task1;

import java.util.Scanner;

public class TaskMultiplyAllDigits {
    public static void main(String[] args) {
        int result;
        String str = args[0];
        char[] chars = str.toCharArray();

        if(str.contains(".")) {
            System.out.println("Invalid input! Fractional number");
        } else if(existNotDigit(chars)) {
            System.out.println("Invalid input! Not a number");
        } else {
            result = getSum(chars);
            System.out.println("Sum of digits:" + result);
        }
    }

    public static boolean existNotDigit(char[] chars) {
        boolean result = false;
        for (int i = 0; i < chars.length; i++) {
            if(!Character.isDigit(chars[i])) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static int getSum(char[] chars) {
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            sum += Character.getNumericValue(chars[i]);
        }
        return sum;
    }
}
