package text;

public class Actor {
    int age;
    Gender gender;
    String name;
    Condition condition;
    Location location;

    public Actor(String name, int age, Location location) {
        setAge(age);
        this.name = name;
        this.location = location;
    }

    public Actor(String name, int age, Gender gender, Location location) {
        setAge(age);
        this.gender = gender;
        this.name = name;
        this.location = location;
    }

    public String getCreationInfo() {
        String infoWithGender = "Создан персонаж " + getName() + " с возрастом " + getAge() + " и гендером " + getGender() + " на локации " + getLocation().getName() + ". ";
        String info = "Создан персонаж " + getName() + " с возрастом " + getAge() + " на локации " + getLocation().getName() + ". ";
        if (gender != null) {
            return infoWithGender;
        } else {
            return info;
        }
    }

    public String move(Location from, Location to) {
        setLocation(to);
        return name + " перемещается из локации " + from.getName() + " в локацию " + to.getName() + ". ";
    }

    public String getHumanizedCondition() {
        switch (condition) {
            case CRY:
                return name + " плачет :'(. ";
            case BORED:
                return name + " скучает. ";
            case SMILE:
                return name + " улыбается. ";
            case NORMAL:
                return name + " в обычном состоянии. ";
            case NEGATIVE:
                return name + " в негативном настроении. ";
            case POSITIVE:
                return name + " в хорошем настроении. ";
            case INTERESTED:
                return name + " в заинтересованном состоянии. ";
            case NERVOUS:
                return name + " нервничает. ";
            case STUNNED:
                return name + " ошеломлен! ";
            case SHOCKED:
                return "У " + name + " отвисла челюсть. ";
            default:
                return name + " в неопределенном состоянии. ";
        }
    }

    public String interact(String smthng, String discr) {
        return name + " взаимодействует с " + smthng + " (" + discr + "). ";
    }

    public String inspectPlace(){
        return name + " осматривает место " + location.getName() + " и получает информацию о месте: " + location.getDescription() + ". ";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
        else throw new IncorrectAgeException("Возраст должен быть положительным");
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
