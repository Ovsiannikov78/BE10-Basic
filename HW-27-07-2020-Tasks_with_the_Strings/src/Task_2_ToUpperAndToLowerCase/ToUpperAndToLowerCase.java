package Task_2_ToUpperAndToLowerCase;

public class ToUpperAndToLowerCase {
    public static void main(String[] args) {
        String str = "Hel*lo";
        System.out.println(stringTransformationByRequest(str));

    }
    /*
       Есть строка. Вернуть новую строку, полученную из первой
       следующим образом, заглавные буквы становятся маленькими,
       а маленькие - заглавными ; Hel*lo -> hEL*LO
     */
    public static String stringTransformationByRequest(String str) {
        return new StringBuilder(str).substring(0, 1).toLowerCase() + str.substring(1, 6).toUpperCase();

    }
}