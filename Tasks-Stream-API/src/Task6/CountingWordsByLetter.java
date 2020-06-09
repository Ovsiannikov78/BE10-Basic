package Task6;

import java.util.Arrays;

public class CountingWordsByLetter {
    public static void main(String[] args) {

    }
    /*
        6. Написать функцию, которая принимает предложение,
           а возвращает количество слов, начинающихся на заданную букву.
     */

    public static int countWords(String str, String letter) {
        return (int) Arrays.stream(str.split(" ")).filter(s -> s.startsWith(letter)).count();
    }
}
