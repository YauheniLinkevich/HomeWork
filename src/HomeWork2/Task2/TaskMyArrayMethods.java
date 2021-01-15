package HomeWork2.Task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskMyArrayMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size than input elements using 'Enter', write 'stop' when you want to exit");
/***
 * comment all this stuff because in 1 time working only 1 method(because of scanner)
  */
//        cycleForArray(scanner);
//        cycleForArraySecondElem(scanner);
//        cycleForArrayReverse(scanner);
//
//        cycleWhile(scanner);
//        cycleWhileSecondElem(scanner);
//        cycleWhileReverse(scanner);
//
//        cycleDoWhile(scanner);
//        cycleDoWhileSecondElem(scanner);
//        cycleDoWhileReverse(scanner);
//
//        cycleForeach(scanner);
//        cycleForeachSecondElem(scanner);
//        cycleForeachReverse(scanner);
//
//        int[] array = arrayRandom(5, 100);
//        for (int i : array) {
//            System.out.print(i + " ");
//        }
    }

    public static int[] arrayFromConsole(Scanner scanner) {
        int size = scanner.nextInt(), i = 0;
        int[] array = new int[size];
        while (i < array.length){
            array[i] = scanner.nextInt();
            if(scanner.hasNext("stop")){
                break;
            }
            i++;
        }

        return array;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] result = new int[size];
        Random rand = new Random();

        for (int i = 0; i < result.length; i++) {
            result[i] = rand.nextInt(maxValueExclusion);
        }

        return result;
    }

    public static void cycleForArray(Scanner scanner) {
        int[] array = arrayFromConsole(scanner);

        System.out.println("\nArray:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void cycleForArraySecondElem(Scanner scanner) {
        int[] array = arrayFromConsole(scanner);

        System.out.println("\nEach second element:");
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
    }
    public static void cycleForArrayReverse(Scanner scanner) {
        int[] array = arrayFromConsole(scanner);

        System.out.println("\nReverse output array:");
        for(int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }

    public static void cycleWhile(Scanner scanner) {
        int[] array = arrayFromConsole(scanner);

        int i = 0;
        System.out.println("\nArray:");
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
    }
    public static void cycleWhileSecondElem(Scanner scanner) {
        int[] array = arrayFromConsole(scanner);
        int i = 1;
        System.out.println("\nEach second element:");
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i += 2;
        }
    }

    public static void cycleWhileReverse(Scanner scanner) {
        int[] array = arrayFromConsole(scanner);
        int i = array.length - 1;
        System.out.println("\nReverse output array:");
        while(i >= 0) {
            System.out.print(array[i] + " ");
            i--;
        }
    }

    public static void cycleDoWhile(Scanner scanner) {
        int[] array = arrayFromConsole(scanner);

        int i = 0;
        System.out.println("\nArray:");
        do {
            System.out.print(array[i] + " ");
            i++;
        } while (i < array.length);
    }

    public static void cycleDoWhileSecondElem(Scanner scanner) {
        int[] array = arrayFromConsole(scanner);
        int i = 1;
        System.out.println("\nEach second element:");
        do {
            System.out.print(array[i] + " ");
            i += 2;
        } while (i < array.length);
    }

    public static void cycleDoWhileReverse(Scanner scanner) {
        int[] array = arrayFromConsole(scanner);
        int i = array.length - 1;
        System.out.println("\nReverse output array:");
        do{
            System.out.print(array[i] + " ");
            i--;
        }while(i >= 0);
    }

    public static void cycleForeach(Scanner scanner) {
        int[] array = arrayFromConsole(scanner);

        System.out.println("\nArray:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static void cycleForeachSecondElem(Scanner scanner) {
        int[] array = arrayFromConsole(scanner);
        int index = 0;
        System.out.println("\nEach second element:");
        for (int element : array) {
            if (index % 2 != 0) {
                System.out.print(element + " ");
            }
            index++;
        }
    }

    public static void cycleForeachReverse(Scanner scanner) {
        int[] array = arrayFromConsole(scanner);
        int index = array.length - 1;
        int[] tmpArray = new int[array.length];
        System.out.println("\nReverse output array:");
        for (int element: array) {
            tmpArray[index--] = element;
        }
        for (int element: tmpArray) {
            System.out.print(element + " ");
        }
    }
}
