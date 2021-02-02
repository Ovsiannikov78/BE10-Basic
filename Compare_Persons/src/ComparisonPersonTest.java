import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparisonPersonTest {

    @Test
    public void testPerson() {
        List<Person> persons = new ArrayList<>();

        Person p1 = new Person("Jack", "Gibson", 25);
        Person p2 = new Person("Anna", "Ivanova", 18);
        Person p3 = new Person("Roman", "Petrov", 32);
        Person p4 = new Person("Irina", "Schneider", 43);

        Collections.addAll(persons, p1, p2, p3, p4);

        List<Person> exp = new ArrayList<>();
        Collections.addAll(exp, p2, p4, p1, p3);

        List<Person> akt = Methods.comparePersonsByFirstName(persons);

        Assert.assertEquals(exp, akt);
    }

    @Test
    public void testPerson1() {
        List<Person> persons = new ArrayList<>();

        Person p1 = new Person("Jack", "Donnert", 25);
        Person p2 = new Person("Anna", "Petrova", 18);
        Person p3 = new Person("Roman", "Ivanov", 32);
        Person p4 = new Person("Irina", "Gibson", 43);

        Collections.addAll(persons, p1, p2, p3, p4);

        List<Person> exp = new ArrayList<>();
        Collections.addAll(exp, p1, p4, p3, p2);

        List<Person> akt = Methods.comparePersonsByLastName(persons);

        Assert.assertEquals(exp, akt);
    }

    @Test
    public void testPerson2() {
        List<Person> persons = new ArrayList<>();

        Person p1 = new Person("Jack", "Donnert", 25);
        Person p2 = new Person("Anna", "Petrova", 18);
        Person p3 = new Person("Roman", "Ivanov", 42);
        Person p4 = new Person("Irina", "Gibson", 31);

        Collections.addAll(persons, p1, p2, p3, p4);

        List<Person> exp = new ArrayList<>();
        Collections.addAll(exp, p2, p1, p4, p3);

        List<Person> akt = Methods.comparePersonsByAge(persons);

        Assert.assertEquals(exp, akt);
    }
}
