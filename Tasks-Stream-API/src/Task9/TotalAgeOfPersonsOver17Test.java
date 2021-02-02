package Task9;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TotalAgeOfPersonsOver17Test {
    /*
        Для списка persons посчитать общий возраст тех, кому больше 17 лет. Подсказка - reduce()
     */

    @Test
    public void testTotalAgeOfPersonsOver17() {
        Person p1 = new Person("Ivan", 25);
        Person p2 = new Person("Vlad", 15);
        Person p3 = new Person("Anna", 16);
        Person p4 = new Person("Eva", 20);
        Person p5 = new Person("John", 35);

        List<Person> personsList = Arrays.asList(p1, p2, p3, p4, p5);

        Integer exp = 80;
        Integer akt = TotalAgeOfPersonsOver17.getTotalAgeOfPersonsOver17(personsList);

        Assert.assertEquals(exp, akt);
    }
}
