package Task8;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class GetListOfAccountsByListOfPersonTest {
    /*
       Написать функцию, которая по списку persons возвращает список их банковских счетов
        с звездочками с третьего символа. Подсказка - flatMap()
     */

    @Test
    public void testGetListOfAccountsByListOfPerson() {

        Person p1 = new Person("Ivan", Arrays.asList("DE5464352345", "GB3434567721"));
        Person p2 = new Person("Vlad", Arrays.asList("AU4545668832", "US7892546371"));

        List<Person> personList = Arrays.asList(p1, p2);

        List<String> exp = Arrays.asList("DE5*********", "GB3*********", "AU4*********", "US7*********");
        List<String> akt = GetListOfAccountsByListOfPerson.getBankAccountListReplacedWithStars(personList);

        Assert.assertEquals(exp, akt);
    }

    @Test
    public void testGetListOfAccountsByListOfPerson1() {

        Person p1 = new Person("Ivan", Arrays.asList("DE5464352345", "GB3434567721"));
        Person p2 = new Person("Vlad", Arrays.asList("AU4545668832", "US7892546371"));

        List<Person> personList = Arrays.asList(p1, p2);

        List<String> exp = Arrays.asList("DE5464352345", "GB3434567721", "AU4545668832", "US7892546371");
        List<String> akt = GetListOfAccountsByListOfPerson.getBankAccountListReplacedWithStars(personList);

        Assert.assertNotEquals(exp, akt);
    }
}
