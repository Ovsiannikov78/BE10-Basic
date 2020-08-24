public class Address {
    private String street;
    private int houseNumber;
    private String City;
    private int postCode;
    private String country;

    public Address() {
    }

    public Address(String street, int houseNumber, String city, int postCode, String country) {
        this.street = street;
        this.houseNumber = houseNumber;
        City = city;
        this.postCode = postCode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "\n" + "Address {" +
                "street = '" + street + '\'' +
                ", houseNumber = " + houseNumber +
                ", City = '" + City + '\'' +
                ", postCode = " + postCode  +
                ", country = '" + country + '\'' +
                "}" + "\n";
    }
}
