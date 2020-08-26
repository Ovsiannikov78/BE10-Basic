
public class CityData {
   private String title;
   private String locationType;
   private String woeid;
   private String lattLong;

    public CityData() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public String getWoeid() {
        return woeid;
    }

    public void setWoeid(String woeid) {
        this.woeid = woeid;
    }

    public String getLattLong() {
        return lattLong;
    }

    public void setLattLong(String lattLong) {
        this.lattLong = lattLong;
    }

    @Override
    public String toString() {
        return "CityData{" +
                "title='" + title + '\'' +
                ", locationType='" + locationType + '\'' +
                ", woeid='" + woeid + '\'' +
                ", lattLong='" + lattLong + '\'' +
                '}';
    }
}
