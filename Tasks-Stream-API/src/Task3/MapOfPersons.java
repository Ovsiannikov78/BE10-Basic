package Task3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapOfPersons {


    public static void main(String[] args) {

    }
    /*
    3. Есть список людей, нужно написать функцию, которая вернет мапу,
       где ключом является возраст, а значением список людей этого возраста.
     */

    public static Map<Integer,String> createMapOfPersonsFromTheList(List<Persons> personsList){
        return personsList.stream().collect(Collectors.toMap(Persons::getAge, Persons::getName));
    }
}
