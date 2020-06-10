package Task8;

import java.util.List;

public class Person {
    private String name;
    private List<String> bankAccounts;

    protected Person(String name, List<String> bankAccounts) {
        this.name = name;
        this.bankAccounts = bankAccounts;
    }

    public List<String> getBankAccounts() {
        return bankAccounts;
    }
}
