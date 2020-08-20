package ClassSolution;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<Score> scores = new ArrayList<>();

        Cockroach[] cockroaches = new Cockroach[10];
        for (int i = 0; i < cockroaches.length; i++) {
            Cockroach cockroach = new Cockroach(10, String.valueOf(i), scores);
            cockroaches[i] = cockroach;
        }

        for (Cockroach cockroach : cockroaches) {
            cockroach.start();
        }

        for (Cockroach cockroach : cockroaches) {
            cockroach.join();
        }

        int i = 0;
        for (Score score : scores) {
            String res = String.format("%d, The tarakan %s ran %d milliseconds"
                    , ++i, score.getName(), score.getResult());
            System.out.println(res);
        }
    }
}

