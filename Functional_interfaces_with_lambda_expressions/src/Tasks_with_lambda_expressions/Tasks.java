package Tasks_with_lambda_expressions;

import java.time.LocalDate;
import java.util.function.*;

public class Tasks {
    public static void main(String[] args) {


        // 1. Given an integer, return a power of integer: 5 -> 25

        UnaryOperator<Integer> powerOfInteger = x -> x * x;
        System.out.println(powerOfInteger.apply(5));

        // 2. Given a string, return modulo 2 of string length: "abcde" -> 1
        Function<String,Integer> moduloOfStringLength = s -> s.length()%2;
        System.out.println(moduloOfStringLength.apply("abcde"));

        // 3. Given a string, return its in upper case: "ivan" -> "IVAN"
        UnaryOperator<String> stringToUpperCase = s -> s.toUpperCase();
        System.out.println(stringToUpperCase.apply("ivan"));

        // 4. Given 2 strings, return a sum of their lengths: "abc", "de" -> 5
        BiFunction<String,String,Integer> sumOfStringsLengths = (s1, s2) -> s1.length() + s2.length();
        System.out.println(sumOfStringsLengths.apply("abc", "de"));

        // 5. Given 2 strings, print a sum of their lengths.
        BiConsumer<String,String> sumOfStringsLengths2 = (s1, s2) -> System.out.println(s1.length() + s2.length());
        sumOfStringsLengths2.accept("abcde","abc");

        // 6. Return a date of one week prior to today: "2020-05-30"
        UnaryOperator<LocalDate> getTheCurrentDateWeekEarlier = date -> LocalDate.now().minusDays(7);
        System.out.println(getTheCurrentDateWeekEarlier.apply(LocalDate.now()));

        // 7. Given a string, return a string, which consists of a first half of its character,
        // if length is even, returns an empty string otherwise: "abcd" -> "ab", "abcde" -> "".

        UnaryOperator<String> getStringByConditions = s -> (s.length()%2 == 0) ? s.substring(0,s.length()/2) : s.replaceAll(s, "");
        System.out.println(getStringByConditions.apply("abcde"));
        System.out.println(getStringByConditions.apply("abcd"));

        // 8. Return a random number
        Supplier<Integer> randomNumber = () -> (int) (Math.random() * 1000);
        System.out.println(randomNumber.get());

        // 9. Given a string, return a reversed string: "abc" ->"cba"
        UnaryOperator<String> reversedString = s -> new StringBuilder(s).reverse().toString();
        System.out.println(reversedString.apply("abc"));

        // 10. Given a number, return a reversed number: 12345 -> 54321
        UnaryOperator<Integer> reversedNumber = x -> Integer.valueOf(new StringBuilder(x.toString()).reverse().toString());
        System.out.println(reversedNumber.apply(12345));

        // 11. Given a number, return true if it is even, false otherwise: 6 -> true, 25 -> false
        Predicate<Integer> evenOrOddNumber = x -> x % 2 == 0;
        System.out.println(evenOrOddNumber.test(6));
        System.out.println(evenOrOddNumber.test(25));

        // 12. Given a string, return true, if its length is more than 3, false otherwise: "ab" -> false, "abc" -> true
        Predicate<String> checkTheString = s -> s.length() >= 3;
        System.out.println(checkTheString.test("ab"));
        System.out.println(checkTheString.test("abc"));


        // 13. Given a string and a number x. Return true, if length of string is more than x, false otherwise. Hint: BiPredicate.
        BiPredicate<String,Integer> comparingStringLengthWithGivenNumber = (s,x) -> s.length() > x;
        System.out.println(comparingStringLengthWithGivenNumber.test("abcde", 3));
        System.out.println(comparingStringLengthWithGivenNumber.test("abcde", 6));





    }
}