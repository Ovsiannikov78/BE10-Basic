package JavaIOAssignment2.Task_2;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private Equipment equipment;

    public Person(String firstName, String lastName, Equipment equipment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.equipment = equipment;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName)
                && Objects.equals(equipment, person.equipment);

    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, equipment);
    }

    @Override
    public String toString() {
        return "Person {" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' + equipment +
                '}'+ "\n";
    }
    protected static String personForSortingByEquipmentPrice(JavaIOAssignment2.Task_2.Person person) {
        return person.getFirstName() + " " + person.getLastName() + "," + person.getEquipment().getPrice() + System.lineSeparator();
    }
}


