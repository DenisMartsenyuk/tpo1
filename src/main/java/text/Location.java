package text;

public class Location {
    private String name;
    private String description;

    public Location(String name, String description) {
        this.name = name;
        this.description = description;
        System.out.println("Создана локация " + name + ", описание: " + description);
    }

    public Location(String name) {
        this.name = name;
        System.out.println("Создана локация " + name);
    }

    //getters

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    //setters

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

}