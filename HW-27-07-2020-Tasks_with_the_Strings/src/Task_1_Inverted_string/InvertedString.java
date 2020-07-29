package Task_1_Inverted_string;

public class InvertedString {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(inversedString(str));

    }
    /*
       Есть строка. Вернуть её перевернутый вариант
       Hello -> olleH
     */

    public static String inversedString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}