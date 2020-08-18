import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CockroachRacing {
    /*
    Есть несколько таракаов (Runnable).
    Каждый таракан делает N шагов(одинаковое).
    Каждый шаг занимает от 50 до 100 мс (рандомно).
    Надо составить таблицу первенства тараканов и распечатеть её ( место, имя и время забега ).
    Class Cockroach implement Runnable{
    void run(){
    for(количество шагов){
       }
    }
    Общий List куда записываются результаты (Score) → в конструктор к таракану
     */

    public static void main(String[] args) throws InterruptedException {

        List<Score> table = new ArrayList<>();

        Cockroach c1 = new Cockroach(" 1 ",10,table);
        Thread th1 = new Thread(c1);
        Cockroach c2 = new Cockroach(" 2 ",10,table);
        Thread th2 = new Thread(c2);
        Cockroach c3 = new Cockroach(" 3 ",10,table);
        Thread th3 = new Thread(c3);
        Cockroach c4 = new Cockroach(" 4 ",10,table);
        Thread th4 = new Thread(c4);
        Cockroach c5 = new Cockroach(" 5 ",10,table);
        Thread th5 = new Thread(c5);


        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th1.join();
        th2.join();
        th3.join();
        th4.join();
        th5.join();

        table.sort(Comparator.comparing(Score::getRaceTime));
        System.out.println(table);
    }
}
