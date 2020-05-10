package List_task_1;

import java.util.*;

public class Main {
    /*
           1. Есть два класса: Address с полями улица и номер дома и Person с полями имя и Address.
              Нужно написать функцию: List<Address> getAddresses(List<Person> persons),
              то есть по списку persons возвращать список их адресов.
      */
    public static void main(String[] args) {

    }
    public static List<Address> getAddress(List<Person> persons) {
        List<Address> personsAddress = new ArrayList<>();
        if(!persons.isEmpty()) {
            for (Person person : persons) {
                personsAddress.add(person.getAddress());
            }
        }
        return personsAddress;
    }
}




