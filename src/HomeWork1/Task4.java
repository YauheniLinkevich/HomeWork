package HomeWork1;

public class Task4 {
    public static void main(String[] args) {

        boolean weekday = true, vacation = true;

        if(sleepIn(weekday, vacation)) {
            System.out.println("можем идти спать дальше");
        } else {
            System.out.println("пора идти на работу");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation) {
            return true;
        }
        return false;
    }
}
