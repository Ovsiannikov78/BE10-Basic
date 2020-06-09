package Task5;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class HiddenPartOfTheBankAccountTest {
    /*
       5. Написать функцию, которая для списка счетов, возвращает список IBANs,
           где в каждом IBAN символы после 3-го и до конца заменены звездочками.
    */

    @Test
    public  void  testHiddenPartOfTheBankAccount(){
        List<String> listOfIBANs = Arrays.asList("DE7656744657", "456376859123423", "US3434566789");
        List<String> exp = Arrays.asList("DE7*********", "456************", "US3*********");

        List<String> akt = HiddenPartOfTheBankAccount.encodedBankAccount(listOfIBANs);

        Assert.assertEquals(exp,akt);
    }
}
