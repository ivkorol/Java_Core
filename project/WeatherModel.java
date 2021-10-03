package project;

import org.codehaus.jackson.map.JsonMappingException;
import project.entity.Weather;

import java.io.IOException;
import java.util.List;

public interface WeatherModel {
    void getWeather(String selectedCity, Period period) throws IOException, JsonMappingException;

    public List<Weather> getSavedToDBWeather();
}

