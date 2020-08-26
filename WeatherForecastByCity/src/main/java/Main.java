import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        System.out.println("Please, enter the city");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String city = reader.readLine();
        CityData[] cityData = mapper.readValue(new URL("https://www.metaweather.com/api/location/search/?query=" + city), CityData[].class);
        //System.out.println(cityData[0]);

        String woeid = cityData[0].getWoeid();
        String UrlName = "https://www.metaweather.com/api/location/" + woeid;

        WeatherForecast forecast = mapper.readValue(new URL(UrlName), WeatherForecast.class);
        System.out.println("City - " + cityData[0].getTitle() +
                "\n" + "Date - " + forecast.getConsolidatedWeather().get(0).getApplicableDate() +
                "\n" + "Temp. - " + forecast.getConsolidatedWeather().get(0).getTheTemp() +
                "\n" + "Humidity - " + forecast.getConsolidatedWeather().get(0).getHumidity() +
                "\n" + "Air pressure - " + forecast.getConsolidatedWeather().get(0).getAirPressure() +
                "\n" + "Precipitations - " + forecast.getConsolidatedWeather().get(0).getWeatherStateName());
    }
}