
import java.util.List;

public class Cockroach implements Runnable {
    private String name;
    private int quantityOfSteps;
    List<Score> table;


    public Cockroach(String name, int quantityOfSteps, List<Score> table) {
        this.name = name;
        this.quantityOfSteps = quantityOfSteps;
        this.table = table;

    }

    @Override
    public void run() {
        long beforeStart = System.currentTimeMillis();
        for (int i = 0; i < quantityOfSteps; i++) {
            try {
                Thread.sleep((long) ((Math.random() * (100 - 50)) + 50));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long afterStart = System.currentTimeMillis();
        table.add(new Score(getName(), (int) (afterStart - beforeStart)));
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cockroach{" +
                "name='" + name + '\'' +
                ", quantityOfSteps=" + quantityOfSteps +
                ", table=" + table +
                '}';
    }
}