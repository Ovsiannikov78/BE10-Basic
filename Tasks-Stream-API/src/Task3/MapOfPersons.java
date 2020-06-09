package Task3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapOfPersons {


    public static void main(String[] args) {
        Persons p1 = new Persons("Ivan", 25);
        Persons p2 = new Persons("Vlad", 18);
        Persons p3 = new Persons("Anna", 32);
        Persons p4 = new Persons("Eva", 18);
        Persons p5 = new Persons("John", 25);

        List<Persons> personsList = Arrays.asList(p1,p2,p3,p4,p5);

        System.out.println(createMapOfPersonsFromTheList(personsList));

    }
    /*
    3. Есть список людей, нужно написать функцию, которая вернет мапу,
       где ключом является возраст, а значением список людей этого возраста.
     */

    public static Map<Integer,List<Persons>> createMapOfPersonsFromTheList(List<Persons> personsList){
        return personsList.stream().collect(Collectors.groupingBy(Persons::getAge));
    }
}
