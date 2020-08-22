package ClassSolution;

import java.util.ArrayList;
import java.util.List;
/*
    Вася, Маша и Петя выдают кредиты.
    Маша выдает кредит от 100 до 200 мс
    Петя выдает кредит от 100 до 300 мс
    Вася ленивый, творческая натура, обычно выдает кредит от 200 до 300 мс.
    Но в каждый момент у него может прийти озарение на 3 последующих кредита и он выдает их от 100 до 150 мс.
    Вероятность озарения 30%.
    Кредитов у каждого 20.
    (Типа как с тараканами)
  */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Result> resultList = new ArrayList<>();
        Thread masha = new StandardEmployee(100,
                200,
                "Masha",
                20,
                resultList);
        Thread petya = new StandardEmployee(100,
                300,
                "Petya",
                20,
                resultList);
        Thread vasya = new LazyInspiredEmployee(200,
                300,
                "Vasya",
                20,
                resultList,
                50,
                100,
                30);

        masha.start();
        petya.start();
        vasya.start();

        masha.join();
        petya.join();
        vasya.join();

        for (Result result : resultList) {
            String toPrint = String.format("The employee %s completed the program for %d", result.getName(), result.getDuration());
            System.out.println(toPrint);
        }
    }
}