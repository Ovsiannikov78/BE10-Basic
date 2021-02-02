package Task3;

public class Persons {
    private String name;
    private int age;

    protected Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person ; " + name + " - " + age;
    }
}
