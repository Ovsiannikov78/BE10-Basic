package Task4;

public class Person {
   private String name;

    protected Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "Person " +
                "name - '" + name + '\'' +
                '}';
    }
}
