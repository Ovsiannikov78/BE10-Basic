public class Result {
    private String name;
    private int time;

    public Result(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Score{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
