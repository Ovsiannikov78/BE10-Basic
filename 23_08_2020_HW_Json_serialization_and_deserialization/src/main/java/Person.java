import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    List<Address> address;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddressList(List<Address> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person {" +
                "firstName = " + firstName +
                ", lastName = " + lastName +
                ", age = " + age + "\n" +
                "addressList = " + address +
                '}' + "\n";
    }
}
