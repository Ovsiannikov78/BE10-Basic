package Task2;

import java.util.List;
import java.util.stream.Collectors;

public class DuplicateNames {
    public static void main(String[] args) {

    }
    /*
    2. Есть список имен, нужно написать функцию, которая вернет список имен без дупликатов.
     */

    public static List<String> removeDuplicateNames(List<String> names){
        return names.stream().distinct().collect(Collectors.toList());
    }
}

