package Task_3;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class IntegerListWithNumbersRepeatedMoreThanOnce {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(-8, 1, -5, 1, 2, 7, 2, 1);
        System.out.println(listOfNumbersRepeatedMoreThanOnce(integerList));

    }
    /*
      Есть List<Integer>. Вернуть новый список, содержащий по одному разу
      только те числа, которые повторяються более 1 раза;
      {-8,1,-5,1,2,7,2,1} -> {1,2} или {2,1}
     */

    public static List<Integer> listOfNumbersRepeatedMoreThanOnce(List<Integer> integerList) {
        return integerList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(l -> l.getValue() > 1)
                .map(Map.Entry::getKey)
                .distinct()
                .collect(Collectors.toList());
    }
}