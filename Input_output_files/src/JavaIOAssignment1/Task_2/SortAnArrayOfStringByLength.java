package JavaIOAssignment1.Task_2;

import java.util.Arrays;
import java.util.Comparator;


public class SortAnArrayOfStringByLength {

    /*
     Есть массив строк разной длины. Отсортировать его по длине строк.
     Пример: вход ​{“aaa”, “bbbb”, “a”, ‘bb”},​выход ​{“a”, “bbb”, “aaa”, “bbbb”}.​
     Подсказка: Stream API, sorted, Comparator, lambda functions, Java Doc.
     */

    public static void main(String[] args) {
        String[] arr = {"aaa", "bbbb", "a", "bb"};

        System.out.println(Arrays.toString(sortAnArrayOfStringByLength(arr)));
    }

    public static String[] sortAnArrayOfStringByLength(String[] arr) {
        return Arrays.stream(arr).sorted(Comparator.comparingInt(String::length)).toArray(value -> arr);
    }
}