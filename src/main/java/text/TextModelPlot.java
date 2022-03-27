package text;

public class TextModelPlot {

    public static void plot() {

        Location a = new Location("Локация А", "Некая локация за пределами сцены");
        Location b = new Location("Локация Б", "Основное место действия");

        Actor Artur = new Actor("Артур", 22, Gender.MALE, a);
        Actor Human = new Actor("Неизвестное существо", 123, Gender.FCKNUNKNOWNPOKEMON, b);
        Actor LeftHead = new Actor("Левая голова", 123, b);
        Actor RightHead = new Actor("Правая голова", 123, b);

        Artur.setCondition(Condition.NERVOUS);
        Artur.move(a, b);
        Artur.inspectPlace();

        Artur.interact("Человек", "Увидел");
        Artur.setCondition(Condition.STUNNED);

        Human.interact("Кресло", "Развалился");
        Human.interact("Пульт управления", "Положил ноги");
        Human.interact("Правая голова", "Ковыряет левой рукой в зубах правой головы");
        RightHead.setCondition(Condition.INTERESTED);
        LeftHead.setCondition(Condition.SMILE);
        Artur.setCondition(Condition.SHOCKED);

    }
}