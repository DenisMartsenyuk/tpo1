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
        printInfo();
    }

    public Actor(String name, int age, Gender gender, Location location) {
        setAge(age);
        this.gender = gender;
        this.name = name;
        this.location = location;
        printInfo();
    }

    public void printInfo() {
        String infoWithGender = "Создан персонаж " + getName() + " с возрастом " + getAge() + " и гендером " + getGender() + " на локации " + getLocation().getName();
        String info = "Создан персонаж " + getName() + " с возрастом " + getAge() + " на локации " + getLocation().getName();
        if (gender != null) {
            System.out.println(infoWithGender);
        } else {
            System.out.println(info);
        }
    }

    public void move(Location from, Location to) {
        setLocation(to);
        System.out.println(name + " перемещается из локации " + from.getName() + " в локацию " + to.getName());
    }

    public void showCondition() {
        switch (condition) {
            case CRY:
                System.out.println(name + " плачет :'(");
                break;
            case BORED:
                System.out.println(name + " скучает");
                break;
            case SMILE:
                System.out.println(name + " улыбается");
                break;
            case NORMAL:
                System.out.println(name + " в обычном состоянии");
                break;
            case NEGATIVE:
                System.out.println(name + " в негативном настроении");
                break;
            case POSITIVE:
                System.out.println(name + " в хорошем настроении");
                break;
            case INTERESTED:
                System.out.println(name + " в заинтересованном состоянии");
                break;
            case NERVOUS:
                System.out.println(name + " нервничает");
                break;
            case STUNNED:
                System.out.println(name + " ошеломлен!");
                break;
            case SHOCKED:
                System.out.println("У " + name + " отвисла челюсть");
                break;
            default:
                System.out.println(name + " в неопределенном состоянии");
                break;
        }
    }

    public void interact(String smthng, String discr) {
        System.out.println(name + " взаимодействует с " + smthng + " (" + discr + ")");
    }

    public void inspectPlace(){
        System.out.println(name + " осматривает место " + location.getName());
        if(location.getDescription() != null) System.out.println(name + " получает информацию о месте: " + location.getDescription());
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
        showCondition();
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
