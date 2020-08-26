

public class ConsolidatedWeather {

    private String theTemp;
    private String weatherStateName;
    private String applicableDate;
    private String airPressure;
    private String humidity;

    public ConsolidatedWeather() {
    }

    public ConsolidatedWeather(String theTemp, String weatherStateName, String applicableDate, String airPressure, String humidity) {
        this.theTemp = theTemp;
        this.weatherStateName = weatherStateName;
        this.applicableDate = applicableDate;
        this.airPressure = airPressure;
        this.humidity = humidity;
    }

    public String getTheTemp() {
        return theTemp;
    }

    public String getWeatherStateName() {
        return weatherStateName;
    }

    public String getApplicableDate() {
        return applicableDate;
    }

    public String getAirPressure() {
        return airPressure;
    }

    public String getHumidity() {
        return humidity;
    }

    @Override
    public String toString() {
        return "ConsolidatedWeather{" +
                "theTemp='" + theTemp + '\'' +
                ", weatherStateName='" + weatherStateName + '\'' +
                ", applicableDate='" + applicableDate + '\'' +
                ", airPressure='" + airPressure + '\'' +
                ", humidity='" + humidity + '\'' +
                '}';
    }
}
