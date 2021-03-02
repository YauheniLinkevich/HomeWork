package HomeWork1;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.*;

public class Task7Test {
    private final Task7 task = new Task7();

    @Test
    @DisplayName("Проверка метода toBinaryString")
    public void toBinaryStringTest() {
        try {
            assertEquals(task.toBinaryString((byte) 42), "00101010");
            assertEquals(task.toBinaryString((byte) 15), "00001111");
            assertEquals(task.toBinaryString((byte) -15), "11110001");
            assertEquals(task.toBinaryString((byte) -42), "11010110");
        }catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }catch (Exception  e) {
            System.out.println(e.getMessage());
        }

        try {
            assertEquals(task.toBinaryString((byte) 3), " ");
        }catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }catch (Exception  e) {
            System.out.println(e.getMessage());
        }

        try {
            assertEquals(task.toBinaryString((byte) 5), "00101010");
        }catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }catch (Exception  e) {
            System.out.println(e.getMessage());
        }
    }
}
