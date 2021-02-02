package Task9;

public class Person {
    private String name;
    private int age;

    protected Person(String name, int age) {
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