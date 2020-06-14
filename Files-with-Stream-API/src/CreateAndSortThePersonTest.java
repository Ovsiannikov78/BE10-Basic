import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class CreateAndSortThePersonTest {

    String file = "people.csv";

    Person p1 = new Person("Ivan", "Petrov", 25);
    Person p2 = new Person("Piotr", "Ivanov", 40);
    Person p3 = new Person("Anna", "Petrova", 34);
    Person p4 = new Person("Sergey", "Lukichev", 40);

    Collection<Person> persons = Arrays.asList(p1, p2, p3, p4);
/*
      Given a text file people.csv:

         Ivan;Petrov;25
         Piotr;Ivanov;40
         Anna;Petrova;34
         Sergey;Lukichev;40

    1.print all persons as java objects
    2.Implement a function, which returns info about an oldest/youngest person
    3.Implement a function, which returns a list of persons of a similar age (List<Person> getPeopleByAge(int age))
*/


    @Test
    public void testCreateListOfPersons() throws IOException {
        Collection<Person> exp = new ArrayList<>();
        Collections.addAll(exp, p1, p2, p3, p4);
        Collection<Person> akt = CreateAndSortThePerson.createListOfPersons(file);
        Assert.assertEquals(exp, akt);
    }

    @Test
    public void testGetOldestPerson() {
        String exp = Arrays.toString(new Person[]{p2, p4});
        String akt = CreateAndSortThePerson.getOldestPerson(persons);
        Assert.assertEquals(exp.toString(), akt);
    }

    @Test
    public void testGetYoungestPerson() {
        String exp = Arrays.toString(new Person[]{p1});
        String akt = CreateAndSortThePerson.getYoungestPerson(persons);
        Assert.assertEquals(exp.toString(), akt);
    }

    @Test
    public void testGetPersonByAge() {
        int age = 40;
        Collection<Person> exp = Arrays.asList(p2, p4);
        List<Person> akt = CreateAndSortThePerson.getPersonByAge(persons, age);
        Assert.assertEquals(exp, akt);
    }
}




