package Task9;

import java.util.Arrays;
import java.util.List;

public class TotalAgeOfPersonsOver17 {
    public static void main(String[] args) {
        Person p1 = new Person("Ivan", 25);
        Person p2 = new Person("Vlad", 15);
        Person p3 = new Person("Anna", 16);
        Person p4 = new Person("Eva", 20);
        Person p5 = new Person("John", 35);

        List<Person> personsList = Arrays.asList(p1,p2,p3,p4,p5);
        System.out.println(getTotalAgeOfPersonsOver17(personsList));

    }
    /*
        Для списка persons посчитать общий возраст тех, кому больше 17 лет. Подсказка - reduce()
     */
    public static int getTotalAgeOfPersonsOver17(List<Person> personsList){
        return personsList.stream().filter(p -> p.getAge() > 17).mapToInt(Person::getAge).sum();
    }
}
