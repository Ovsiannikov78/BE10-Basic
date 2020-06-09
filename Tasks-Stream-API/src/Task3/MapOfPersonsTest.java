package Task3;

import org.junit.Assert;
import org.junit.Test;


import java.util.Arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapOfPersonsTest {
    /*
    3. Есть список людей, нужно написать функцию, которая вернет мапу,
       где ключом является возраст, а значением список людей этого возраста.
     */

    @Test
    public void testMapOfPersons(){
        Persons p1 = new Persons("Ivan", 25);
        Persons p2 = new Persons("Vlad", 18);
        Persons p3 = new Persons("Anna", 32);
        Persons p4 = new Persons("Eva", 18);
        Persons p5 = new Persons("John", 25);

        List<Persons> personsList = Arrays.asList(p1,p2,p3,p4,p5);

        Map<Integer,List<Persons>> exp = personsList.stream().collect(
                Collectors.groupingBy(Persons::getAge));

        Map<Integer,List<Persons>> akt = MapOfPersons.createMapOfPersonsFromTheList(personsList);
        Assert.assertEquals(exp,akt);
    }
}
