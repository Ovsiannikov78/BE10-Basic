import java.util.List;

public class WeatherForecast  {
    List<ConsolidatedWeather> consolidatedWeather;

    public WeatherForecast() {
    }

    public List<ConsolidatedWeather> getConsolidatedWeather() {
        return consolidatedWeather;
    }

    public void setConsolidatedWeather(List<ConsolidatedWeather> consolidatedWeather) {
        this.consolidatedWeather = consolidatedWeather;
    }

    @Override
    public String toString() {
        return "WeatherForecast{" +
                "consolidatedWeather=" + consolidatedWeather +
                '}';
    }
}
