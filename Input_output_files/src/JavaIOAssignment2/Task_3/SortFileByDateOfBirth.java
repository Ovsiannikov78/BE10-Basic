package JavaIOAssignment2.Task_3;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class SortFileByDateOfBirth {
    /*
      Есть файл со списком имен с датами рождения:
          Sergey,15-02-1979
          Ivan,22-03-1986
          Piotr ,01-10-1955
          Anna,13-12-1995
      Нужно написать программу, которая возвращает файл со списком имен и дат рождений,
      отсортированный по дате рождения.

      Дополнительное задание:​те строки в файле, для которых дата рождения указана в другом формате,
      записать в отдельный файл без изменений.
     */
    public static void main(String[] args) throws IOException {
        File file = new File("namesWithDates.txt");
        sortFileByDateOfBirth(file);

    }

    public static File sortFileByDateOfBirth(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw = new BufferedWriter(new FileWriter("sortedPersonsByDateOfBirth.txt"));
        br.lines()
                .map(s -> s.replaceAll("\"", "").split(","))
                .map(arr -> (new Person(arr[0], LocalDate.parse(arr[1], DateTimeFormatter.ofPattern("dd-MM-yyyy")))))
                .sorted(Comparator.comparing(Person::getDateOfBirth))
                .forEach(person -> {
                    try {
                        bw.write(Person.personForTheFile(person));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
        bw.close();
        return file;
    }
}


