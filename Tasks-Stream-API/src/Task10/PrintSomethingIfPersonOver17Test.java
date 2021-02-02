package Task10;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PrintSomethingIfPersonOver17Test {

/*
       Написать функцию, которая для списка persons напечатает для тех, кто старше 17 лет:
       In Germany <name1> and <name2> and ...<nameN> are of legal age.
       Подсказка - Collectors.joining();
    */

    @Test
    public void testPrintSomethingIfPersonOver17() {
        Person p1 = new Person("Ivan", 25);
        Person p2 = new Person("Vlad", 15);
        Person p3 = new Person("Anna", 12);
        Person p4 = new Person("Eva", 18);
        Person p5 = new Person("John", 27);

        List<Person> personsList = Arrays.asList(p1, p2, p3, p4, p5);

        String exp = "In Germany Ivan and Eva and John are of legal age.";
        String akt = PrintSomethingIfPersonOver17.getStringOfPersonsNamesOver17WithSomeText(personsList);

        Assert.assertEquals(exp, akt);
    }

    @Test
    public void testPrintSomethingIfPersonOver17_1() {
        Person p1 = new Person("Ivan", 25);
        Person p2 = new Person("Vlad", 15);
        Person p3 = new Person("Anna", 12);
        Person p4 = new Person("Eva", 18);
        Person p5 = new Person("John", 27);

        List<Person> personsList = Arrays.asList(p1, p2, p3, p4, p5);

        String exp = "In Germany Ivan and Vlad and Anna are of legal age.";
        String akt = PrintSomethingIfPersonOver17.getStringOfPersonsNamesOver17WithSomeText(personsList);

        Assert.assertNotEquals(exp, akt);
    }

    @Test
    public void testPrintSomethingIfPersonOver17_2() {
        Person p1 = new Person("Ivan", 25);
        Person p2 = new Person("Vlad", 15);
        Person p3 = new Person("Anna", 12);
        Person p4 = new Person("Eva", 18);
        Person p5 = new Person("John", 27);

        List<Person> personsList = Arrays.asList(p1, p2, p3, p4, p5);

        String exp = " ";
        String akt = PrintSomethingIfPersonOver17.getStringOfPersonsNamesOver17WithSomeText(personsList);

        Assert.assertFalse(akt.isEmpty());
    }
}
