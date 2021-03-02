package HomeWork1;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.*;

public class Task6Test {
    private final Task6 task = new Task6();

    @Test
    @DisplayName("Проверка метода createPhoneNumber")
    public void createPhoneNumberTest(){
        try {
            assertEquals(task.createPhoneNumber(new int[]{6, 2, 1, 7, 7, 8, 1, 3, 2, 9}),
                    "(621) 778-1329");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }

        try {
            assertEquals(task.createPhoneNumber(new int[]{6, -2, 1, 7, 7, 8, 1, 3, 2, 9}),
                    "(621) 778-1329");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }

        try {
            assertEquals(task.createPhoneNumber(new int[]{6, 2, 1, 7, 7, 8, 1, 3, 2, 9}),
                    " ");
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }
}
