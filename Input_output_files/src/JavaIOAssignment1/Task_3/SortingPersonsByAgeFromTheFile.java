package JavaIOAssignment1.Task_3;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class SortingPersonsByAgeFromTheFile {
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

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("csv.txt");
        System.out.println(createSortedListOfThePersonsFromTheFile(file));

    }


    public static List<Person> createSortedListOfThePersonsFromTheFile(File file) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(file));
            return br.lines().map(s -> s.replaceAll("\"", "").split(","))
                                .map(arr -> new Person(arr[0], Integer.parseInt(arr[1])))
                                .filter(p -> p.getAge() > 17)
                                .sorted(Comparator.comparing(Person::getAge))
                                .collect(Collectors.toCollection(ArrayList::new));
        }
    }
