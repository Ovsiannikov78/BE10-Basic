import Exceptions.InappropriateAgeException;
import Exceptions.InappropriateIbanLengthException;
import org.junit.Test;

public class VerificationOfUserDataTest {
    Customer customer1 = new Customer("Ivan", 23, new BankAccount("DE12123412341234"));
    Customer customer2 = new Customer("Anna", 16, new BankAccount("DE23456745674567"));
    Customer customer3 = new Customer("John", 33, new BankAccount("IT12123412"));
    Customer customer4 = new Customer("Inga", 15, new BankAccount("AU324532453245"));

    @Test
    public void testValidAge() throws InappropriateAgeException {
        VerificationOfUserData.InappropriateAge(customer1);
    }
    @Test(expected = InappropriateAgeException.class)
    public void testInvalidAge() throws InappropriateAgeException {
        VerificationOfUserData.InappropriateAge(customer2);
    }
    @Test
    public void testValidIbanLength() throws InappropriateIbanLengthException {
        VerificationOfUserData.InappropriateIbanLength(customer1);
    }
    @Test(expected = InappropriateIbanLengthException.class)
    public void testInvalidIbanLength() throws InappropriateIbanLengthException {
        VerificationOfUserData.InappropriateIbanLength(customer3);
    }
    @Test
    public void testValidIbanCountryCode() throws InappropriateIbanLengthException {
        VerificationOfUserData.InappropriateIbanLength(customer1);
    }
    @Test(expected = InappropriateIbanLengthException.class)
    public void testInvalidIbanCountryCode() throws InappropriateIbanLengthException {
        VerificationOfUserData.InappropriateIbanLength(customer4);
    }
    @Test
    public void testValidCustomerData() throws InappropriateIbanLengthException {
        VerificationOfUserData.checkCustomer(customer1);
    }
}
