package JavaIOAssignment1.Task_2;

import org.junit.Assert;
import org.junit.Test;

public class SortAnArrayOfStringByLengthTest {
    /*
     Есть массив строк разной длины. Отсортировать его по длине строк.
     Пример: вход ​{“aaa”, “bbbb”, “a”, ‘bb”},​выход ​{“a”, “bbb”, “aaa”, “bbbb”}.​
     Подсказка: Stream API, sorted, Comparator, lambda functions, Java Doc.
     */
    String[] arr = {"aaa", "bbbb", "a", "bb"};

    @Test
    public void testSortedArray() {
        String[] exp = {"a", "bb", "aaa", "bbbb"};
        String[] akt = SortAnArrayOfStringByLength.sortAnArrayOfStringByLength(arr);

        Assert.assertArrayEquals(exp, akt);
    }

    @Test
    public void testUnsortedArray() {
        String[] exp = {"aaa", "bbbb", "a", "bb"};
        String[] akt = SortAnArrayOfStringByLength.sortAnArrayOfStringByLength(arr);

        Assert.assertNotSame(exp, akt);
    }
}