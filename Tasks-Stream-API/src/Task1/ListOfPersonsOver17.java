package Task1;

import java.util.List;
import java.util.stream.Collectors;

public class ListOfPersonsOver17 {
    public static void main(String[] args) {

    }
    /*
      Написать функцию, которая по списку persons вернет список адресов тех людей, чей возраст больше 17 лет.
   */

    public static List<Person> listOfAddresses(List<Person> persons){
       return persons.stream().filter(p -> p.getAge() > 17).collect(Collectors.toList());
    }

}
