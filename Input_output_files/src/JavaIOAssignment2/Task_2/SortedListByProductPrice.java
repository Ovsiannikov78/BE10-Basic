package JavaIOAssignment2.Task_2;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

import static JavaIOAssignment2.Task_2.Person.personForSortingByEquipmentPrice;


public class SortedListByProductPrice {
    /*
       Есть файл: Sergey,Lukichev,Notebook Lenovo,500
                  Piotr,Ivanov,Apple MacBook,800
                  Sergey,Lukichev,Keyboard Cherry,25
                  Ivan,Petrov,Mouspad,5
                  Piotr,Ivanov,Apple Touchpad,60

       То есть список имен с оборудованием и оценочной стоимостью.
       Имена могут повторяться. Нужно написать программу,
       которая вернет файл с отсортированным по сумме списком имен и суммой по стоимости для каждого человека:

                  Ivan Petrov,5
                  Sergey Lukichev,525
                  Piotr Ivanov,860
     */
    public static void main(String[] args) throws IOException {
        File file = new File("persons.txt");
        readAndSortPersonsFile(file);

    }

    public static File readAndSortPersonsFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw = new BufferedWriter(new FileWriter("sortedPersonsByEquipmentPrice.txt"));
        (br.lines()
                .map(s -> s.replaceAll("\"", "").split(","))
                .map(arr -> (new Person(arr[0], arr[1], (new Equipment(arr[2], Integer.parseInt(arr[3]))))))
                .collect(Collectors.groupingBy(Person::getKey, Collectors.summingInt(p -> p.getEquipment().getPrice())))
                .entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getValue)))
                .forEach((entry) -> {
                    try {
                        bw.write(personForSortingByEquipmentPrice(entry));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
        bw.close();
        return file;
    }
}