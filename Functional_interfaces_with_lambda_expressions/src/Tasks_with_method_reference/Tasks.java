package Tasks_with_method_reference;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Tasks {
    public static void main(String[] args) {

        // 1. Print a given string
        Consumer<String> printString = System.out::println;
        printString.accept("Hello");

        // 2. Given a string, return a lower case string
        UnaryOperator<String> stringToLowerCase = String::toLowerCase;
        System.out.println(stringToLowerCase.apply("WORLD"));

        // 3. Given a number, return a square root from the number
        UnaryOperator<Double> squareRootFromTheNumber = Math::sqrt;
        System.out.println(squareRootFromTheNumber.apply(25d));

        // 4. Implement solution 7 from above as a method reference
        // Given a string, return a string, which consists of a first half of its character,
        // if length is even, returns an empty string otherwise: "abcd" -> "ab", "abcde" -> "".
        UnaryOperator<String> getStringByConditions = s -> (s.length()%2 == 0) ? s.substring(0,s.length()/2) : s.replaceAll(s, "");
        System.out.println(getStringByConditions.apply("abcde"));
        System.out.println(getStringByConditions.apply("abcd"));


    }
}
