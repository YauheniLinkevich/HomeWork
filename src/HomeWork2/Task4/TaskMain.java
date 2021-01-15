package HomeWork2.Task4;

import java.util.Random;
import java.util.Scanner;

public class TaskMain {
    public static void main(String[] args){
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {1,1,1,1};
        int[] array3 = {9,1,5,99,9,9};
        int[] array4 = {};

        Scanner scanner = new Scanner(System.in);

        TaskSortMethods sort = new TaskSortMethods();

        System.out.print("\nSorted array:");
        sort.coctailSort(array1);
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.print("\nSorted array:");
        sort.bubbleSort(array2);
        for (int i : array2) {
            System.out.print(i + " ");
        }
        System.out.print("\nSorted array:");
        sort.coctailSort(array3);
        for (int i : array3) {
            System.out.print(i + " ");
        }
        System.out.print("\nSorted array:");
        sort.bubbleSort(array4);
        for (int i : array4) {
            System.out.print(i + " ");
        }
        System.out.print("\n");

        int[] array5 = arrayRandom();
        System.out.print("\nArray:");
        for (int i : array5) {
            System.out.print(i + " ");
        }
        System.out.print("\nSorted array:");
        sort.coctailSort(array5);
        for (int i : array5) {
            System.out.print(i + " ");
        }
        System.out.print("\n");

        int[] array6 = arrayFromConsole(scanner);
        System.out.print("\nArray:");
        for (int i : array6) {
            System.out.print(i + " ");
        }
        System.out.print("\nSorted array:");
        sort.coctailSort(array6);
        for (int i : array6) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
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

    public static int[] arrayRandom() {
        Random rand = new Random();
        int[] result = new int[rand.nextInt(100)];

        for (int i = 0; i < result.length; i++) {
            result[i] = rand.nextInt(100);
        }

        return result;
    }
}
