package HomeWork1;
import java.util.Objects;
import java.util.Scanner;

public class Task5 {

    public static class Names1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input name: ");
            String name = in.nextLine();
            if("Вася".equals(name)) {
                System.out.print("Привет!\nЯ тебя так долго ждал");
            } else {
                if("Анастасия".equals(name)) {
                    System.out.print("Я тебя так долго ждал");
                } else {
                    System.out.print("Добрый день, а вы кто?");
                }
            }
            in.close();
        }
    }

    public static class Names2 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input name: ");
            String name = in.nextLine();
            if("Вася".equals(name)) {
                System.out.print("Привет!\nЯ тебя так долго ждал");
            } else if ("Анастасия".equals(name)) {
                System.out.print("Я тебя так долго ждал");
            } else {
                System.out.print("Добрый день, а вы кто?");
            }
            in.close();
        }
    }

    public static class Names3 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input name: ");
            String name = in.nextLine();
            switch(name) {
                case "Вася":
                    System.out.print("Привет!\nЯ тебя так долго ждал");
                    break;
                case "Анастасия":
                    System.out.print("Я тебя так долго ждал");
                    break;
                default:
                    System.out.print("Добрый день, а вы кто?");
                    break;
            }
            in.close();
        }
    }
}
