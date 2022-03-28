package text;

public class TextModelPlot {

    public static String plot() {

        StringBuilder writingBuilder = new StringBuilder();

        Location a = new Location("Локация А", "Некая локация за пределами сцены");
        writingBuilder.append(a.getCreationInfo());
        Location b = new Location("Локация Б", "Основное место действия");
        writingBuilder.append(b.getCreationInfo());

        Actor Artur = new Actor("Артур", 22, Gender.MALE, a);
        writingBuilder.append(Artur.getCreationInfo());
        Actor Human = new Actor("Неизвестное существо", 123, Gender.FCKNUNKNOWNPOKEMON, b);
        writingBuilder.append(Human.getCreationInfo());
        Actor LeftHead = new Actor("Левая голова", 123, b);
        writingBuilder.append(LeftHead.getCreationInfo());
        Actor RightHead = new Actor("Правая голова", 123, b);
        writingBuilder.append(RightHead.getCreationInfo());

        Artur.setCondition(Condition.NERVOUS);
        writingBuilder.append(Artur.getHumanizedCondition());
        writingBuilder.append(Artur.move(a, b));
        writingBuilder.append(Artur.inspectPlace());

        writingBuilder.append(Artur.interact("Человек", "Увидел"));
        Artur.setCondition(Condition.STUNNED);
        writingBuilder.append(Artur.getHumanizedCondition());

        writingBuilder.append(Human.interact("Кресло", "Развалился"));
        writingBuilder.append(Human.interact("Пульт управления", "Положил ноги"));
        writingBuilder.append(Human.interact("Правая голова", "Ковыряет левой рукой в зубах правой головы"));
        RightHead.setCondition(Condition.INTERESTED);
        writingBuilder.append(RightHead.getHumanizedCondition());
        LeftHead.setCondition(Condition.SMILE);
        writingBuilder.append(LeftHead.getHumanizedCondition());
        Artur.setCondition(Condition.SHOCKED);
        writingBuilder.append(Artur.getHumanizedCondition());

        return writingBuilder.toString();
    }
}