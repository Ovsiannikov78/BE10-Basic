
package Task4;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BankAccountMapTest {
  /*
    Написать функцию, которая возвращает мапу, где ключём является Person,
    а значением - список его банковских счетов.
 */
    @Test
    public void testBankAccountMap(){
        BankAccount account1 = new BankAccount ("DE5464352345",new Person("Ivan"));
        BankAccount account2 = new BankAccount ("GB3434567721",new Person("Ivan"));
        BankAccount account3 = new BankAccount ("AU4545668832",new Person("Vlad"));
        BankAccount account4 = new BankAccount ("US7892546371",new Person("Vlad"));

        List<BankAccount> bankAccountList = Arrays.asList(account1,account2,account3,account4);

        Map<Person, List<BankAccount>> exp = bankAccountList.stream().collect(Collectors.groupingBy(BankAccount::getOwner));

        Map<Person,List<BankAccount>> akt = BankAccountMap.createBankAccountNameFromTheList(bankAccountList);

        Assert.assertEquals(exp,akt);

    }
}

