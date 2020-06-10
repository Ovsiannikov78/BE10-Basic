package Task7;

public class CheckTheString {
    public static void main(String[] args) {
        String str = "2356";
        System.out.println(checkTheString(str));
    }
    /*
        7. Написать функцию, которая проверяет, является ли заданная строка целым числом.
           Подсказка - Character.isDigit() и Stream.allMatch().
    */

    public static boolean checkTheString(String str) {
        return str.chars().allMatch(Character::isDigit);
    }
}
