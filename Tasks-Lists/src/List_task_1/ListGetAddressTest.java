package List_task_1;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static List_task_1.Main.getAddress;

public class ListGetAddressTest {
  /*
       1. Есть два класса: Address с полями улица и номер дома и Person с полями имя и Address.
          Нужно написать функцию: List<Address> getAddresses(List<Person> persons),
          то есть по списку persons возвращать список их адресов.
  */
    @Test
    public void testGetAddress(){
        List<Address> address = new ArrayList<>();
        Address address1 = new Address("Munich Str.", 3);
        Address address2 = new Address("Berliner Str.", 24);
        Address address3 = new Address("Moscow Str.", 9);
        address.add(address1);
        address.add(address2);
        address.add(address3);

        List<Person> persons = new ArrayList<>();
        Person person1 = new Person("Ivan", address1);
        Person person2 = new Person("Jack", address2);
        Person person3 = new Person("Vlad", address3);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        List<Address> exp  = new ArrayList<> (address);
        List<Address> akt = getAddress(persons);

        Assert.assertEquals(exp, akt);
    }
}
