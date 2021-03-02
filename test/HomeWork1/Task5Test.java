package HomeWork1;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class Task5Test {
    private final Task5.NamesIf taskNameIf = new Task5.NamesIf();
    private final Task5.NamesIfElse taskNameIfElse = new Task5.NamesIfElse();
    private final Task5.NamesSwitch taskNameSwitch = new Task5.NamesSwitch();

    @Test
    @DisplayName("Проверка класса NameIf")
    public void NameIfTest() {
        assertEquals(taskNameIf.welcom("Вася"), "Привет!\nЯ тебя так долго ждал");
        assertEquals(taskNameIf.welcom("Анастасия"), "Я тебя так долго ждал");
        assertEquals(taskNameIf.welcom("Леня"), "Добрый день, а вы кто?");
    }

    @Test
    @DisplayName("Проверка класса NameIf")
    public void NameIfElseTest() {
        assertEquals(taskNameIfElse.welcom("Вася"), "Привет!\nЯ тебя так долго ждал");
        assertEquals(taskNameIfElse.welcom("Анастасия"), "Я тебя так долго ждал");
        assertEquals(taskNameIfElse.welcom("Игорь"), "Добрый день, а вы кто?");
    }

    @Test
    @DisplayName("Проверка класса NameIf")
    public void NameSwitchTest() {
        assertEquals(taskNameSwitch.welcom("Вася"), "Привет!\nЯ тебя так долго ждал");
        assertEquals(taskNameSwitch.welcom("Анастасия"), "Я тебя так долго ждал");
        assertEquals(taskNameSwitch.welcom("12893г89о"), "Добрый день, а вы кто?");
    }
}
