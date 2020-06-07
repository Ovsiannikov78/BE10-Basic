package Task8;

import java.util.List;

public class Person {
    private String name;
    private List<String> bankAccounts;

    public Person(String name, List<String> bankAccounts) {
        this.name = name;
        this.bankAccounts = bankAccounts;
    }

    public String getName() {
        return name;
    }

    public List<String> getBankAccounts() {
        return bankAccounts;
    }
}
