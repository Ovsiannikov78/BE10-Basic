package Task8;

public class BankAccount {
    private String IBAN;

    protected BankAccount(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getIBAN() {
        return IBAN;
    }
}
