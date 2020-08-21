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

public class BankEmployee implements Runnable {
    private String name;
    private int quantityCredits;
    private int min1, max1, min2, max2;
    private int probabilityOfInsight;
    List<Result> resultList;



    public BankEmployee(String name, int quantityCredits, int min1, int max1, int min2, int max2, int probabilityOfInsight, List<Result> resultList) {
        this.name = name;
        this.quantityCredits = quantityCredits;
        this.min1 = min1;
        this.max1 = max1;
        this.min2 = min2;
        this.max2 = max2;
        this.probabilityOfInsight = probabilityOfInsight;
        this.resultList = resultList;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < quantityCredits; i++) {
            try {
                if(i <= (quantityCredits - ((quantityCredits * probabilityOfInsight) / 100))) {
                 Thread.sleep((long) ((Math.random() * (max1 - min1)) + min1));
                }else{
                    Thread.sleep((long) ((Math.random() * (max2 - min2)) + min2));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();
        resultList.add(new Result(getName(), (int) (end - start)));

    }


    @Override
    public String toString() {
        return "BankEmployee{" +
                "name='" + name + '\'' +
                ", quantityCredits=" + quantityCredits +
                ", scoreList=" + resultList +
                '}';
    }
}
