import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
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
    public static void main(String[] args) throws InterruptedException {
        List<Result> resultList = new ArrayList<>();

        BankEmployee be1 = new BankEmployee("Masha",20,100,200,100,200,30, resultList);
        Thread th1 = new Thread(be1);
        BankEmployee be2 = new BankEmployee("Petya",20,100,300,100,300,30, resultList);
        Thread th2 = new Thread(be2);
        BankEmployee be3 = new BankEmployee("Vasya",20,200,300,50,100,30, resultList);
        Thread th3 = new Thread(be3);


        th1.start();
        th2.start();
        th3.start();

        th1.join();
        th2.join();
        th3.join();

        resultList.sort(Comparator.comparing(Result::getTime));
        System.out.println(resultList);
    }
}
