package Task1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import java.util.List;

public class ListOfPersonsOver17Test {
  /*
      Написать функцию, которая по списку persons вернет список адресов тех людей, чей возраст больше 17 лет.
  */
    @Test
    public void testListOfPersonsOver17(){
        Person p1 = new Person("Ivan",25, new Address("Lenina str", 4));
        Person p2 = new Person("Yana",17, new Address("Berliner str", 23));
        Person p3 = new Person("Ian",43, new Address("London str", 12));
        Person p4 = new Person("Olga",14, new Address("Potsdamer str", 112));

        List<Person> persons = Arrays.asList(p1,p2,p3,p4);

        List<Address> exp = Arrays.asList(p1.getAddress(),p3.getAddress());

        List<Address> akt = ListOfPersonsOver17.listOfAddresses(persons);

        Assert.assertEquals(exp,akt);
    }

}

