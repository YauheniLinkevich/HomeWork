package HomeWork2.Task1;

public class TaskMultiplicationTable {
    public static void main(String[] args) {
        int digit, row;
        for(row = 1; row <= 10; row++) {
            for (digit = 2; digit < 6; digit++) {
                System.out.print(digit + " x " + (row < 10 ? " " + row : row) + " = "
                        + ((digit * row) < 10 ? " " + (digit * row) : (digit * row))
                        + ((digit == 5) ? "" : " | "));
            }
            System.out.println("");
        }

        System.out.println("-----------------------------------------------------");

        for(row = 1; row <= 10; row++) {
            for (digit = 6; digit < 10; digit++) {
                System.out.print(digit + " x " + (row < 10 ? " " + row : row) + " = "
                        + ((digit * row) < 10 ? " " + (digit * row) : (digit * row))
                        + ((digit == 9) ? "" : " | "));
            }
            System.out.println("");
        }
    }
}
