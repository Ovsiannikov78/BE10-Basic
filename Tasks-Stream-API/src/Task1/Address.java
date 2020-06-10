package Task1;

public class Address {
    private String street;
    private int houseNumber;

    protected Address(String street, int houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }
    @Override
    public String toString() {
        return street + ". " + houseNumber;
    }
}
