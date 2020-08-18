public class Score {
   private String name;
   private long raceTime;

    public Score(String name, int raceTime ) {
        this.name = name;
        this.raceTime = raceTime;
    }

   public long getRaceTime() {
        return raceTime;
    }

    @Override
    public String toString() {
        return "Score {" +
                "name = '" + name + '\'' +
                ", raceTime = " + raceTime +
                '}' + "\n";
    }
}