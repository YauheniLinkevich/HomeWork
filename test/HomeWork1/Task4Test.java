package HomeWork1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task4Test {

    private final Task4 task = new Task4();

    @Test
    @DisplayName("Проверка метода sleepIn")
    public void sleepInTest() {
        assertEquals(task.sleepIn (false,false), true);
        assertEquals(task.sleepIn (true,false), false);
        assertEquals(task.sleepIn (false,true), true);
        assertEquals(task.sleepIn (true,true), true);
    }
}
