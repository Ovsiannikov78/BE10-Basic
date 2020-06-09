package Task1;

public class Person {
    private String name;
    private int age;
    private Address address;

    protected Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person " +
                "name = " + name + " ; " +
                " age = " + age + " ; " +
                " address = " + address ;
    }
}
