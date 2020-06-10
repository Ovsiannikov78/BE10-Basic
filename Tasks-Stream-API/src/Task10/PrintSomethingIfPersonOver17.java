package Task10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintSomethingIfPersonOver17 {
    public static void main(String[] args) {
        Person p1 = new Person("Ivan", 25);
        Person p2 = new Person("Vlad", 15);
        Person p3 = new Person("Anna", 12);
        Person p4 = new Person("Eva", 18);
        Person p5 = new Person("John", 27);

        List<Person> personsList = Arrays.asList(p1, p2, p3, p4, p5);
        System.out.println(getStringOfPersonsNamesOver17WithSomeText(personsList));
    }
    /*
       Написать функцию, которая для списка persons напечатает для тех, кто старше 17 лет:
       In Germany <name1> and <name2> and ...<nameN> are of legal age.
       Подсказка - Collectors.joining();
    */

    public static String getStringOfPersonsNamesOver17WithSomeText(List<Person> personsList) {

      /*  return "In Germany " + personsList.stream().filter(p -> p.getAge() > 17).
                map(Person::getName).collect(Collectors.joining(" and ")) +              // сам сделал так, потом подъсмотрел возможности joining
                " are of legal age."; */

        return personsList.stream().filter(p -> p.getAge() > 17).
                map(Person::getName).collect(Collectors.
                joining(" and ", "In Germany ", " are of legal age."));
    }
}
