package HomeWork1;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input one side of triangle, please: ");
        int firstNumber = in.nextInt();
        System.out.println("Input another side of triangle, please: ");
        int secondNumber = in.nextInt();

        double hptnz = Math.hypot((double)firstNumber, (double)secondNumber);
        System.out.println("Value of hypotinus: " + hptnz);


        System.out.println("Input first number, please: ");
        firstNumber = in.nextInt();
        System.out.println("Input second number, please: ");
        secondNumber = in.nextInt();

        if(firstNumber == secondNumber) {
            System.out.println("Numbers are equal");
        } else {
            int result = Math.max(firstNumber, secondNumber);
            System.out.println("Number " + result + " greater\n");
        }

        try {
            Math.multiplyExact(firstNumber, secondNumber);
        } catch(Exception e) {
            System.out.println("ERROR! " + e.getMessage());
        }
    }
}
