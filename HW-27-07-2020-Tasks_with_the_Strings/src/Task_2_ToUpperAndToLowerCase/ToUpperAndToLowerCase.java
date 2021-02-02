package Task_2_ToUpperAndToLowerCase;

import static java.util.stream.Collectors.joining;

public class ToUpperAndToLowerCase {
    public static void main(String[] args) {
        String str = "Hel*lo";
        String str1 = "hELLOwORLD";

        System.out.println(stringTransformationByRequest(str));
        System.out.println("================================");
        System.out.println(stringTransformationByRequest1(str1));

    }
    /*
       Есть строка. Вернуть новую строку, полученную из первой
       следующим образом, заглавные буквы становятся маленькими,
       а маленькие - заглавными ; Hel*lo -> hEL*LO
     */


    public static String stringTransformationByRequest(String str) {
        return new StringBuilder(str).substring(0, 1).toLowerCase() + str.substring(1, 6).toUpperCase(); // для конкретной строки

    }

    public static String stringTransformationByRequest1(String str1) {
        return str1
                .chars()
                .map(s -> Character.isUpperCase(s) ? Character.toLowerCase(s) : Character.toUpperCase(s))
                .mapToObj(s -> (char) s)
                .map(Object::toString)
                .collect(joining());
    }
}