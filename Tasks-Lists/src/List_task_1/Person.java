package List_task_1;

public class Person {

    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    public Address getAddress() {
        return address;
    }
}
