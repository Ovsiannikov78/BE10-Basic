import java.util.Objects;

public class Customer {
    private String name;
    private int age;
    private BankAccount account;

    public Customer(String name, int age, BankAccount account) {
        this.name = name;
        this.age = age;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public BankAccount getAccount() {
        return account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return age == customer.age &&
                name.equals(customer.name) &&
                account.equals(customer.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, account);
    }

    @Override
    public String toString() {
        return "Customer --- " +
                "Name = '" + name + '\'' +
                ", Age = " + age +
                ", Bank account = " + account;
    }
}
