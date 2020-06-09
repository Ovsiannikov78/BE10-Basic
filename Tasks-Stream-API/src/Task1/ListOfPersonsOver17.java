package Task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfPersonsOver17 {
    public static void main(String[] args) {

        Person p1 = new Person("Ivan",25, new Address("Lenina str", 4));
        Person p2 = new Person("Yana",17, new Address("Berliner str", 23));
        Person p3 = new Person("Ian",43, new Address("London str", 12));
        Person p4 = new Person("Olga",14, new Address("Potsdamer str", 112));

        List<Person> persons = Arrays.asList(p1,p2,p3,p4);
        System.out.println(listOfAddresses(persons));

    }
    /*
      Написать функцию, которая по списку persons вернет список адресов тех людей, чей возраст больше 17 лет.
   */

    public static List<Address> listOfAddresses(List<Person> persons){
       return persons.stream().filter(p -> p.getAge() > 17).map(Person::getAddress).collect(Collectors.toList());
    }

}
