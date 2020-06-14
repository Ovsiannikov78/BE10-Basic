import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class CreateAndSortThePerson {
    public static void main(String[] args) throws IOException {
        String file = "people.csv";

        Collection<Person> persons = (createListOfPersons(file));
        System.out.println("============ List Of Persons ============= ");

        System.out.println(createListOfPersons(file));
        System.out.println("========== Oldest Person =============");

        System.out.println(getOldestPerson(persons));
        System.out.println("========== Youngest Person =============");

        System.out.println(getYoungestPerson(persons));
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
    }

    public static Person getPerson(String file) {
        String[] str = file.split(";");
        return new Person(str[0], str[1], Integer.parseInt(str[2]));
    }

    public static List<Person> createListOfPersons(String file) throws IOException {
        Stream<String> personStream = Files.lines(Paths.get(file));
        return personStream.map(CreateAndSortThePerson::getPerson).collect(Collectors.toList());
    }

    public static String getOldestPerson(Collection<Person> persons) {
        return String.valueOf(persons.stream()
                .collect(Collectors.groupingBy(Person::getAge, TreeMap::new,Collectors.toList()))
                .lastEntry()
                .getValue());
    }

    public static String getYoungestPerson(Collection<Person> persons) {
        return String.valueOf(persons.stream()
                .collect(Collectors.groupingBy(Person::getAge, TreeMap::new,Collectors.toList()))
                .firstEntry()
                .getValue());
    }

    public static List<Person> getPersonByAge(Collection<Person> persons, int age) {
        return persons.stream().filter(p -> p.getAge() == age).collect(toList());
    }

}
