package text;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ActorTest {

    private Location a;
    private Location b;
    private Actor Artur;


    @BeforeEach
    public void setup() {
        this.a = new Location("Локация А", "Некая локация за пределами сцены");
        this.b = new Location("Локация Б", "Основное место действия");
        this.Artur = new Actor("Артур", 22, Gender.MALE, a);
    }

    @Test
    @DisplayName("Test Actor move")
    public void moveTest() {
        Artur.move(a, b);
        assertEquals(b.getName(), Artur.getLocation().getName());
    }

    @Test
    @DisplayName("Test Actor set age")
    void setAgeTest() {
        Artur.setAge(18);
        assertEquals(18, Artur.getAge());
    }

    @Test
    @DisplayName("Test Actor set incorrect age")
    void setIncorrectAgeTest() {
        Exception exception = assertThrows(Exception.class, () -> Artur.setAge(-18));
        assertEquals("Возраст должен быть положительным", exception.getMessage());
    }

    @Test
    @DisplayName("Test Actor inspect location")
    void inspectLocationTest() {
        PrintStream defaultPrintStream = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String expResult = "Артур осматривает место Локация А" + "\n" +
                "Артур получает информацию о месте: Некая локация за пределами сцены" + "\n";

        Artur.inspectPlace();
        String sout = output.toString();
        expResult = expResult.replaceAll("\n", "").replaceAll("\r", "");
        sout = sout.replaceAll("\n", "").replaceAll("\r", "");
        assertEquals(expResult, sout);
        System.setOut(defaultPrintStream);
    }

    @Test
    @DisplayName("Test Actor set condition")
    void setConditionTest() {
        PrintStream defaultPrintStream = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String expResult = "У Артур отвисла челюсть";

        Artur.setCondition(Condition.SHOCKED);
        String sout = output.toString();
        sout = sout.replaceAll("\n", "").replaceAll("\r", "");

        assertEquals(expResult, sout);
        System.setOut(defaultPrintStream);
    }
}