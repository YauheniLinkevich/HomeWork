package HomeWork2.Task1;

import java.util.Scanner;

public class TaskNumberExponentiation {
    public static void main(String[] args) {
        double number, result = 1;
        int exponent;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number:");
        String str = scanner.nextLine();
        number = Double.parseDouble(str);
        System.out.println("Input exponent:");
        str = scanner.nextLine();
        char[] chars = str.toCharArray();

        if (existNotDigit(chars)) {
            System.out.println("Invalid input! Not a number");
        } else {
            if (str.contains("-")) {
                System.out.println("Invalid input! Negative number");
            } else {
                exponent = Integer.parseInt(str);
                if(exponent == 0) {
                    System.out.println("Result:" + (result = 1));
                } else if(exponent == 1) {
                    System.out.println("Result:" + (result = number));
                } else {
                    for(int i = 0; i < exponent; i++) {
                        result *= number;
                    }
                    System.out.println("Result:" + result);
                }
            }
        }
        scanner.close();
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
}
