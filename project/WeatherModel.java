package project;

import com.fasterxml.jackson.databind.JsonMappingException;
import project.entity.Weather;

import java.io.IOException;
import java.util.List;

public interface WeatherModel {
    void getWeather(String selectedCity, Period period) throws IOException, JsonMappingException;

    @SuppressWarnings("UnnecessaryInterfaceModifier")
    public List<Weather> getSavedToDBWeather();
}

