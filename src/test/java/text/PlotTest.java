package text;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlotTest {
    @Test
    @DisplayName("Test Plot")
    void plotTest() {
        PrintStream defaultPrintStream = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String expResult = "Создана локация Локация А, описание: Некая локация за пределами сцены\n" +
                "Создана локация Локация Б, описание: Основное место действия\n" +
                "Создан персонаж Артур с возрастом 22 и гендером MALE на локации Локация А\n" +
                "Создан персонаж Неизвестное существо с возрастом 123 и гендером FCKNUNKNOWNPOKEMON на локации Локация Б\n" +
                "Создан персонаж Левая голова с возрастом 123 на локации Локация Б\n" +
                "Создан персонаж Правая голова с возрастом 123 на локации Локация Б\n" +
                "Артур нервничает\n" +
                "Артур перемещается из локации Локация А в локацию Локация Б\n" +
                "Артур осматривает место Локация Б\n" +
                "Артур получает информацию о месте: Основное место действия\n" +
                "Артур взаимодействует с Человек (Увидел)\n" +
                "Артур ошеломлен!\n" +
                "Неизвестное существо взаимодействует с Кресло (Развалился)\n" +
                "Неизвестное существо взаимодействует с Пульт управления (Положил ноги)\n" +
                "Неизвестное существо взаимодействует с Правая голова (Ковыряет левой рукой в зубах правой головы)\n" +
                "Правая голова в заинтересованном состоянии\n" +
                "Левая голова улыбается\n" +
                "У Артур отвисла челюсть";


        TextModelPlot.plot();
        String sout = output.toString();
        sout = sout.replaceAll("\n", "").replaceAll("\r", "");
        expResult = expResult.replaceAll("\n", "").replaceAll("\r", "");

        assertEquals(expResult, sout);
        System.setOut(defaultPrintStream);
    }
}
