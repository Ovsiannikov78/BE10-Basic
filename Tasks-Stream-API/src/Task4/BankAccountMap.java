package Task4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BankAccountMap {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("DE5464352345", new Person("Ivan"));
        BankAccount account2 = new BankAccount("GB3434567721", new Person("Ivan"));
        BankAccount account3 = new BankAccount("AU4545668832", new Person("Vlad"));
        BankAccount account4 = new BankAccount("US7892546371", new Person("Vlad"));

        List<BankAccount> bankAccountList = Arrays.asList(account1, account2, account3, account4);

        System.out.println(createBankAccountNameFromTheList(bankAccountList));

    }
    /*
    Написать функцию, которая возвращает мапу, где значением является Person,
    а значением - список его банковских счетов.
     */

    public static Map<Person, List<BankAccount>> createBankAccountNameFromTheList(List<BankAccount> bankAccountList) {
        return bankAccountList.stream().collect(Collectors.groupingBy(BankAccount::getOwner));
    }
}
