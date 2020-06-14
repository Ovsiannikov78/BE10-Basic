public class Person {
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    private String firstName;
    private String lastName;
    private int age;

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person --- " +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", age = " + age +
                '\n';
    }
}
