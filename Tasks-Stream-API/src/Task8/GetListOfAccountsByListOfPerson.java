package Task8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetListOfAccountsByListOfPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Ivan", Arrays.asList("DE5464352345", "GB3434567721"));
        Person p2 = new Person("Vlad", Arrays.asList("AU4545668832", "US7892546371"));

        List<Person> personList = Arrays.asList(p1, p2);
        System.out.println(getBankAccountListReplacedWithStars(personList));
    }
    /*
       Написать функцию, которая по списку persons возвращает список их банковских счетов
        с звездочками с третьего символа. Подсказка - flatMap()
     */

    public static List<String> getBankAccountListReplacedWithStars(List<Person> personList) {
        return personList.stream().flatMap(p -> p.getBankAccounts().stream())
                .map(ib -> ib.substring(0, 3) + ib.substring(3).replaceAll("\\d", "*")).collect(Collectors.toList());
    }
}
