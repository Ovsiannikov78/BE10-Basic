package Task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HiddenPartOfTheBankAccount {
    public static void main(String[] args) {
        List<String> listOfIBANs = Arrays.asList("DE7656744657", "456376859123423", "US3434566789");
        System.out.println(encodedBankAccount(listOfIBANs));
    }
    /*
             5. Написать функцию, которая для списка счетов, возвращает список IBANNs,
              где в каждом IBAN символы после 3-го и до конца заменены звездочками.
    */
    public static List<String> encodedBankAccount(List<String> listOfIBANs) {
        return listOfIBANs.stream().map(s -> s.substring(0, 3) + s.substring(3).replaceAll("\\d", "*")).collect(Collectors.toList());
    }
}


