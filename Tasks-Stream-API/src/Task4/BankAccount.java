package Task4;

public class BankAccount {
   private String IBAN;
   private Person owner;

    protected BankAccount(String IBAN, Person owner) {
        this.IBAN = IBAN;
        this.owner = owner;
    }
    public Person getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return  "BankAccount - " +
                "IBAN = '" + IBAN + '\'' +
                ", owner = " + owner + "\n  =========================== \n";

    }
}
