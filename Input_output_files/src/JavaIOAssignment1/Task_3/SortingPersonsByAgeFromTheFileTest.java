
package JavaIOAssignment1.Task_3;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingPersonsByAgeFromTheFileTest {
    File file = new File("csv.txt");
 /*
    Есть текстовый csv файл:
    “Ivan”, “18”
    “Piotr”, “20”
    “Anna”, “10”

    Вывести на экран отсортированный по возрасту список.
    Подсказка: вычитать файл построчно с помощью Reader’a, положить данные в список классов Person,
    список отсортировать с помощью Stream API.

    Можно усложнить - вычитать только тех, кто старше 17 лет. Тут разные варианты решения: вычитать всех,
    потом отсортировать тех, кто старше 17, но если список в файле большой, то может не стоит создавать объекты в Джаве,
    то есть проверять в процессе чтения и создавать Джава объекты только для тех пользователей, что старше 17.

*/
/*
 @Test (expected = FileNotFoundException.class )
 public void testFileNotFoundException() throws FileNotFoundException {
     File file1 = new File("css.txt");
     List<Person> exp = Arrays.asList(new Person("Anna",10),
             new Person("Ivan",18),                                  // этот тест мы используем, если использовать
             new Person("Piotr",20));                               // задокументированный метод в SortingPersonsByAgeFromTheFile

     List<Person> akt =SortingPersonsByAgeFromTheFile.createSortedListOfThePersonsFromTheFile(file1);


 }

 */
    @Test
    public void testSortedListOfThePersonsByAge() {
        List<Person> exp = Arrays.asList(new Person("Ivan",18),
                                         new Person("Piotr",20));


        List<Person> akt =SortingPersonsByAgeFromTheFile.createSortedListOfThePersonsFromTheFile(file);

        Assert.assertEquals(exp,akt);
    }
    @Test
    public void testNotSortedListOfThePersonsByAge() {
        List<Person> exp = Arrays.asList(new Person("Piotr",20),
                                         new Person("Ivan",18),
                                         new Person("Anna",10) );

        List<Person> akt =SortingPersonsByAgeFromTheFile.createSortedListOfThePersonsFromTheFile(file);

        Assert.assertNotEquals(exp,akt);
    }

    @Test
    public void testEmptyListOfPersons() {
        List<Person> exp = Collections.emptyList();

        List<Person> akt =SortingPersonsByAgeFromTheFile.createSortedListOfThePersonsFromTheFile(file);

        Assert.assertNotEquals(exp,akt);
    }
}